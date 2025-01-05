import os
import re

root_dir = '/home/roham/Results-Utestgen/dataset/SF110-ES-src'  # Change this to your root directory

def modify_files(root_dir):
    for root, dirs, files in os.walk(root_dir):
        for file in files:
            if re.match(r'.*_ESTest\.java$', file):
                print("found ", os.path.join(root, file))
                file_path = os.path.join(root, file)
                with open(file_path, 'r') as f:
                    lines = f.readlines()
                
                with open(file_path, 'w') as f:
                    skip_next_lines = False
                    for line in lines:
                        """
                        if '@RegisterExtension' in line:
                            skip_next_lines = True
                            continue
                        if skip_next_lines:
                            if 'static EvoRunnerJUnit5' in line:
                                skip_next_lines = False
                            continue
                        """
                        #if '@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)' in line:
                        #   f.write('@RunWith(EvoRunner.class)\n')

                        #if 'import org.junit.jupiter.api.Test' in line:
                        #   f.write('import org.evosuite.runtime.EvoRunner;\n')
                        
                        if '@RunWith' in line:
                            f.write('import org.junit.runner.RunWith;\n\n')


                        f.write(line)

if __name__ == '__main__':
    modify_files(root_dir)

