package ipac;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;

/**
 *  Title: URL Opener
 *  <br>Description: Opens up a website using the user's default browser.
 *  <br>December 10, 2005
 *  <br>Supports: Mac OS X, GNU/Linux, Unix, Windows XP
 *  <br>Public Domain Software -- Free to Use as You Like
 *
 *  @author http://www.centerkey.com/java/browser/
 *  @author Jason Wang (JavaDoc Comments & Compatibility Editting)
 *  @version 1.5
 */

public class URLOpener{
    
    /**
     *  Opens up the default detected web browser to a given IP address. If a
     *  web browser is not found, an error pop-up message is displayed.
     *
     *  @param   url     an URL address to be open on the default detected web
     *                   browser
     */
    public URLOpener(String url) {
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Mac OS")) {
                Class fileMgr = Class.forName("com.apple.eio.FileManager");
                Method openURL = fileMgr.getDeclaredMethod("openURL",
                        new Class[] {String.class});
                openURL.invoke(null, new Object[] {url});
            } else if (osName.startsWith("Windows"))
                Runtime.getRuntime().exec(
                        "rundll32 url.dll,FileProtocolHandler " + url);
            else { //assume Unix or Linux
                String[] browsers = {
                    "firefox", "opera", "konqueror", "epiphany", "mozilla",
                    "netscape" };
                String browser = null;
                for (int count = 0; count < browsers.length && browser == null;
                count++)
                    if (Runtime.getRuntime().exec(new String[] {"which",
                    browsers[count]}).waitFor() == 0)
                        browser = browsers[count];
                if (browser == null)
                    throw new Exception("Could not find web browser");
                else
                    Runtime.getRuntime().exec(new String[] {browser, url});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error attempting to launch " +
                    "web browser" + ":\n" + e.getLocalizedMessage());
        }
    }
}