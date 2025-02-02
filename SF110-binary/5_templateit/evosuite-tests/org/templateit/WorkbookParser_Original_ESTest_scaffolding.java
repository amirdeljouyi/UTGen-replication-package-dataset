/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 10:09:09 GMT 2024
 */

package org.templateit;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class WorkbookParser_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.templateit.WorkbookParser"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @BeforeEach
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @AfterEach
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(WorkbookParser_Original_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.poi.hssf.record.PasswordRev4Record",
      "org.apache.poi.hssf.record.DefaultColWidthRecord",
      "org.apache.poi.hssf.record.ArrayRecord",
      "org.apache.poi.hssf.record.DateWindow1904Record",
      "org.apache.poi.hssf.util.PaneInformation",
      "org.apache.poi.hpsf.VariantTypeException",
      "org.apache.log4j.Level",
      "org.apache.poi.hssf.usermodel.HSSFSheet",
      "org.apache.poi.hssf.record.PageBreakRecord",
      "org.apache.poi.hssf.record.StyleRecord",
      "org.apache.poi.hssf.record.PrintSetupRecord",
      "org.apache.poi.hssf.record.Record",
      "org.apache.poi.POIDocument",
      "org.apache.poi.hssf.record.aggregates.RecordAggregate",
      "org.apache.poi.hssf.usermodel.HSSFHeader",
      "org.apache.poi.hssf.record.PrecisionRecord",
      "org.apache.poi.hssf.record.TopMarginRecord",
      "org.apache.poi.hssf.record.FnGroupCountRecord",
      "org.apache.poi.ddf.EscherBlipRecord",
      "org.apache.poi.hssf.record.HorizontalPageBreakRecord",
      "org.apache.poi.hssf.record.WindowTwoRecord",
      "org.apache.poi.ddf.EscherSplitMenuColorsRecord",
      "org.apache.poi.hssf.usermodel.HSSFDataValidation",
      "org.apache.poi.hssf.record.HeaderRecord",
      "org.apache.poi.hssf.record.UnicodeString",
      "org.apache.poi.hssf.record.IterationRecord",
      "org.apache.log4j.Hierarchy",
      "org.apache.poi.hssf.record.RecordFormatException",
      "org.apache.poi.hssf.record.ExternSheetRecord$RefSubRecord",
      "org.apache.poi.hssf.record.BOFRecord",
      "org.apache.poi.hssf.record.FontRecord",
      "org.apache.poi.hssf.usermodel.HSSFShape",
      "org.apache.poi.hpsf.SpecialPropertySet",
      "org.apache.poi.hssf.record.SharedValueRecordBase",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.poi.hssf.record.InterfaceEndRecord",
      "org.apache.poi.util.BitFieldFactory",
      "org.apache.poi.hssf.record.PasswordRecord",
      "org.apache.poi.hssf.record.PaletteRecord",
      "org.apache.poi.hssf.record.WSBoolRecord",
      "org.apache.poi.hssf.util.CellRangeAddressBase",
      "org.apache.poi.hssf.record.aggregates.RecordAggregate$RecordVisitor",
      "org.apache.poi.hssf.record.RightMarginRecord",
      "org.apache.poi.hssf.record.BottomMarginRecord",
      "org.apache.poi.poifs.filesystem.EntryNode",
      "org.apache.poi.hssf.model.Model",
      "org.apache.poi.hssf.usermodel.HSSFPrintSetup",
      "org.apache.poi.hssf.usermodel.HSSFPatriarch",
      "org.apache.poi.hssf.record.EscherAggregate",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.poi.poifs.filesystem.DocumentInputStream",
      "org.apache.poi.poifs.filesystem.Entry",
      "org.apache.poi.hssf.record.VCenterRecord",
      "org.templateit.Reference",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.poi.hpsf.SummaryInformation",
      "org.apache.poi.util.NullLogger",
      "org.apache.poi.hssf.model.LinkTable$CRNBlock",
      "org.apache.log4j.Category",
      "org.apache.poi.ddf.EscherContainerRecord",
      "org.apache.poi.poifs.filesystem.DirectoryEntry",
      "org.apache.poi.hssf.record.ProtectionRev4Record",
      "org.apache.poi.hssf.record.EOFRecord",
      "org.apache.poi.hssf.usermodel.HSSFRow$CellIterator",
      "org.apache.poi.util.POILogger",
      "org.apache.poi.ddf.EscherProperty",
      "org.apache.poi.hssf.record.HCenterRecord",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.apache.poi.hssf.record.SharedFormulaRecord",
      "org.apache.poi.hssf.record.BackupRecord",
      "org.apache.poi.hssf.record.ColumnInfoRecord",
      "org.apache.poi.hssf.usermodel.HSSFFont",
      "org.apache.poi.hssf.record.WriteAccessRecord",
      "org.apache.poi.ss.formula.WorkbookDependentFormula",
      "org.apache.poi.ddf.EscherDggRecord",
      "org.apache.log4j.PropertyWatchdog",
      "org.apache.poi.hssf.record.ExternalNameRecord",
      "org.apache.poi.hpsf.UnsupportedVariantTypeException",
      "org.apache.poi.poifs.dev.POIFSViewable",
      "org.apache.poi.hssf.model.Workbook",
      "org.apache.poi.ddf.EscherBoolProperty",
      "org.apache.poi.hssf.util.Region",
      "org.apache.poi.hssf.record.NameRecord",
      "org.apache.poi.hssf.model.Sheet",
      "org.apache.poi.hssf.record.aggregates.ConditionalFormattingTable",
      "org.apache.poi.poifs.filesystem.POIFSFileSystem",
      "org.apache.poi.hpsf.PropertySet",
      "org.apache.poi.hssf.record.IndexRecord",
      "org.apache.poi.hssf.util.CellRangeAddress",
      "org.apache.poi.hssf.record.DSFRecord",
      "org.templateit.TemplateSheet",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.Priority",
      "org.templateit.MergeRegion",
      "org.apache.poi.hssf.record.FileSharingRecord",
      "org.apache.poi.hssf.usermodel.HSSFFooter",
      "org.apache.poi.hssf.record.DimensionsRecord",
      "org.apache.log4j.LogManager",
      "org.apache.poi.hssf.usermodel.HSSFName",
      "org.apache.poi.hpsf.HPSFException",
      "org.apache.poi.hssf.record.aggregates.MergedCellsTable",
      "org.apache.poi.hssf.record.WindowProtectRecord",
      "org.apache.poi.hssf.record.GutsRecord",
      "org.apache.poi.hssf.record.MergeCellsRecord",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.templateit.Region",
      "org.apache.poi.hssf.record.FormatRecord",
      "org.apache.poi.hssf.usermodel.HSSFRow",
      "org.apache.log4j.or.RendererMap",
      "org.apache.poi.hpsf.DocumentSummaryInformation",
      "org.apache.poi.hssf.record.FooterRecord",
      "org.apache.poi.hpsf.WritingNotSupportedException",
      "org.apache.poi.hssf.record.formula.NameXPtg",
      "org.apache.poi.hssf.record.CellValueRecordInterface",
      "org.apache.poi.hssf.record.BookBoolRecord",
      "org.apache.poi.hssf.record.HideObjRecord",
      "org.apache.poi.hssf.record.aggregates.RowRecordsAggregate",
      "org.apache.poi.hssf.util.CellRangeAddress8Bit",
      "org.apache.poi.hssf.record.formula.Ptg",
      "org.apache.poi.hssf.record.aggregates.ColumnInfoRecordsAggregate",
      "org.apache.poi.hssf.record.AbstractEscherHolderRecord",
      "org.apache.poi.hssf.record.PrintHeadersRecord",
      "org.apache.poi.ddf.EscherBitmapBlip",
      "org.apache.poi.util.StringUtil",
      "org.apache.poi.hssf.record.BoundSheetRecord$1",
      "org.apache.poi.hssf.record.MMSRecord",
      "org.apache.poi.hssf.usermodel.HSSFSheetConditionalFormatting",
      "org.apache.poi.poifs.filesystem.DirectoryNode",
      "org.apache.poi.hssf.record.DBCellRecord",
      "org.apache.poi.hssf.usermodel.HSSFRichTextString",
      "org.apache.log4j.CategoryKey",
      "org.apache.poi.hssf.model.LinkTable",
      "org.apache.poi.util.IntMapper",
      "org.apache.poi.hssf.record.CalcCountRecord",
      "org.apache.poi.hssf.usermodel.HSSFWorkbook",
      "org.apache.poi.hssf.record.CodepageRecord",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.templateit.WorkbookParser",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.templateit.TemplateWorkbook",
      "org.apache.poi.hssf.usermodel.HSSFPalette",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.poi.hssf.record.aggregates.SharedValueManager",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.poi.hssf.record.ExtSSTRecord",
      "org.apache.poi.hssf.record.TableRecord",
      "org.apache.poi.util.POILogFactory",
      "org.apache.poi.hssf.record.RefreshAllRecord",
      "org.apache.poi.util.BitField",
      "org.apache.poi.hssf.record.LeftMarginRecord",
      "org.apache.poi.hssf.record.formula.OperandPtg",
      "org.apache.poi.hssf.record.SSTDeserializer",
      "org.apache.poi.hssf.record.GridsetRecord",
      "org.apache.poi.hssf.record.DefaultRowHeightRecord",
      "org.apache.poi.hssf.record.VerticalPageBreakRecord",
      "org.apache.log4j.Logger",
      "org.apache.poi.hpsf.MutablePropertySet",
      "org.apache.poi.ddf.EscherRGBProperty",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.poi.ddf.EscherBSERecord",
      "org.apache.poi.ddf.EscherOptRecord",
      "org.apache.poi.hssf.record.aggregates.DataValidityTable",
      "org.apache.poi.hssf.record.aggregates.PageSettingsBlock",
      "org.apache.poi.ddf.EscherSimpleProperty",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.poi.hssf.record.RefModeRecord",
      "org.apache.poi.hssf.record.BoundSheetRecord",
      "org.apache.poi.hssf.record.CountryRecord",
      "org.apache.poi.hssf.usermodel.HSSFComment",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.poi.hssf.record.RecordBase",
      "org.apache.poi.hssf.record.PrintGridlinesRecord",
      "org.apache.poi.hssf.record.ExternSheetRecord",
      "org.apache.poi.hssf.usermodel.HSSFTextbox",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.poi.hssf.record.CalcModeRecord",
      "org.apache.poi.hssf.record.SelectionRecord",
      "org.apache.poi.ddf.EscherRecord",
      "org.apache.poi.hssf.usermodel.HSSFSimpleShape",
      "org.apache.poi.hssf.record.aggregates.ValueRecordsAggregate",
      "org.apache.poi.hssf.record.UseSelFSRecord",
      "org.apache.poi.hssf.usermodel.HSSFRow$MissingCellPolicy",
      "org.apache.poi.hssf.record.WindowOneRecord",
      "org.apache.poi.hssf.model.WorkbookRecordList",
      "org.apache.poi.hssf.record.WriteProtectRecord",
      "org.apache.poi.hssf.record.DeltaRecord",
      "org.apache.poi.hssf.record.ProtectRecord",
      "org.apache.poi.hssf.record.InterfaceHdrRecord",
      "org.apache.poi.hssf.usermodel.HSSFShapeContainer",
      "org.apache.poi.hssf.usermodel.HeaderFooter",
      "org.apache.poi.hssf.record.SupBookRecord",
      "org.apache.poi.hssf.record.SSTRecord",
      "org.apache.poi.hssf.record.TabIdRecord",
      "org.apache.poi.hssf.usermodel.HSSFCellStyle",
      "org.apache.poi.hssf.usermodel.HSSFDataFormat",
      "org.apache.poi.hssf.model.LinkTable$ExternalBookBlock",
      "org.apache.poi.hssf.record.SaveRecalcRecord",
      "org.apache.poi.hssf.record.ExtendedFormatRecord",
      "org.apache.poi.hssf.record.Margin",
      "org.apache.poi.hssf.record.UncalcedRecord",
      "org.apache.log4j.spi.LoggerRepository"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(WorkbookParser_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.templateit.WorkbookParser",
      "org.templateit.OpMatcher",
      "org.templateit.TemplateWorkbook",
      "org.apache.poi.util.POILogger",
      "org.apache.poi.util.NullLogger",
      "org.apache.poi.util.POILogFactory",
      "org.apache.poi.poifs.filesystem.POIFSFileSystem",
      "org.apache.poi.poifs.property.PropertyTable",
      "org.apache.poi.poifs.property.Property",
      "org.apache.poi.poifs.property.DirectoryProperty",
      "org.apache.poi.poifs.property.RootProperty",
      "org.apache.poi.util.ShortField",
      "org.apache.poi.util.ByteField",
      "org.apache.poi.util.IntegerField",
      "org.apache.poi.util.LittleEndian",
      "org.apache.poi.hpsf.ClassID",
      "org.apache.poi.poifs.storage.SmallDocumentBlock",
      "org.apache.poi.poifs.filesystem.EntryNode",
      "org.apache.poi.poifs.filesystem.DirectoryNode",
      "org.apache.poi.poifs.filesystem.POIFSDocumentPath",
      "org.apache.poi.POIDocument",
      "org.apache.poi.hssf.usermodel.HSSFWorkbook",
      "org.apache.poi.hssf.model.Workbook",
      "org.apache.poi.hssf.model.WorkbookRecordList",
      "org.apache.poi.hssf.record.RecordBase",
      "org.apache.poi.hssf.record.Record",
      "org.apache.poi.hssf.record.BOFRecord",
      "org.apache.poi.hssf.record.InterfaceHdrRecord",
      "org.apache.poi.hssf.record.MMSRecord",
      "org.apache.poi.hssf.record.InterfaceEndRecord",
      "org.apache.poi.hssf.record.WriteAccessRecord",
      "org.apache.poi.hssf.record.CodepageRecord",
      "org.apache.poi.hssf.record.DSFRecord",
      "org.apache.poi.hssf.record.TabIdRecord",
      "org.apache.poi.hssf.record.FnGroupCountRecord",
      "org.apache.poi.hssf.record.WindowProtectRecord",
      "org.apache.poi.hssf.record.ProtectRecord",
      "org.apache.poi.hssf.record.PasswordRecord",
      "org.apache.poi.hssf.record.ProtectionRev4Record",
      "org.apache.poi.hssf.record.PasswordRev4Record",
      "org.apache.poi.util.BitFieldFactory",
      "org.apache.poi.util.BitField",
      "org.apache.poi.hssf.record.WindowOneRecord",
      "org.apache.poi.hssf.record.BackupRecord",
      "org.apache.poi.hssf.record.HideObjRecord",
      "org.apache.poi.hssf.record.DateWindow1904Record",
      "org.apache.poi.hssf.record.PrecisionRecord",
      "org.apache.poi.hssf.record.RefreshAllRecord",
      "org.apache.poi.hssf.record.BookBoolRecord",
      "org.apache.poi.hssf.record.FontRecord",
      "org.apache.poi.hssf.record.FormatRecord",
      "org.apache.poi.util.StringUtil",
      "org.apache.poi.hssf.record.ExtendedFormatRecord",
      "org.apache.poi.hssf.record.StyleRecord",
      "org.apache.poi.hssf.record.UseSelFSRecord",
      "org.apache.poi.hssf.record.BoundSheetRecord$1",
      "org.apache.poi.hssf.record.BoundSheetRecord",
      "org.apache.poi.hssf.record.CountryRecord",
      "org.apache.poi.hssf.model.LinkTable",
      "org.apache.poi.hssf.model.LinkTable$ExternalBookBlock",
      "org.apache.poi.hssf.record.SupBookRecord",
      "org.apache.poi.hssf.record.ExternSheetRecord",
      "org.apache.poi.hssf.record.ExternSheetRecord$RefSubRecord",
      "org.apache.poi.hssf.record.UnicodeString",
      "org.apache.poi.hssf.record.SSTRecord",
      "org.apache.poi.util.IntMapper",
      "org.apache.poi.hssf.record.SSTDeserializer",
      "org.apache.poi.hssf.record.ExtSSTRecord",
      "org.apache.poi.hssf.record.EOFRecord",
      "org.apache.poi.hssf.usermodel.HSSFRow$MissingCellPolicy",
      "org.apache.poi.hssf.usermodel.HSSFRow",
      "org.apache.poi.poifs.storage.HeaderBlockReader",
      "org.apache.poi.util.IOUtils",
      "org.apache.poi.poifs.filesystem.POIFSDocument",
      "org.apache.poi.poifs.property.DocumentProperty",
      "org.apache.poi.poifs.filesystem.POIFSDocument$SmallBlockStore",
      "org.apache.poi.poifs.filesystem.POIFSDocument$BigBlockStore",
      "org.apache.poi.poifs.filesystem.DocumentNode",
      "org.apache.poi.hssf.usermodel.HSSFFont",
      "org.apache.poi.poifs.storage.BigBlock",
      "org.apache.poi.poifs.storage.PropertyBlock",
      "org.apache.poi.poifs.storage.PropertyBlock$1",
      "org.apache.poi.poifs.storage.SmallBlockTableWriter",
      "org.apache.poi.poifs.storage.BlockAllocationTableWriter",
      "org.apache.poi.util.IntList",
      "org.apache.poi.poifs.storage.BATBlock",
      "org.apache.poi.poifs.storage.HeaderBlockWriter",
      "org.apache.poi.util.LongField",
      "org.apache.poi.hssf.usermodel.HSSFSheet",
      "org.apache.poi.hssf.model.Sheet",
      "org.apache.poi.hssf.record.aggregates.RecordAggregate",
      "org.apache.poi.hssf.record.aggregates.MergedCellsTable",
      "org.apache.poi.hssf.record.CalcModeRecord",
      "org.apache.poi.hssf.record.CalcCountRecord",
      "org.apache.poi.hssf.record.RefModeRecord",
      "org.apache.poi.hssf.record.IterationRecord",
      "org.apache.poi.hssf.record.DeltaRecord",
      "org.apache.poi.hssf.record.SaveRecalcRecord",
      "org.apache.poi.hssf.record.PrintHeadersRecord",
      "org.apache.poi.hssf.record.PrintGridlinesRecord",
      "org.apache.poi.hssf.record.GridsetRecord",
      "org.apache.poi.hssf.record.GutsRecord",
      "org.apache.poi.hssf.record.DefaultRowHeightRecord",
      "org.apache.poi.hssf.record.WSBoolRecord",
      "org.apache.poi.hssf.record.aggregates.PageSettingsBlock",
      "org.apache.poi.hssf.record.PageBreakRecord",
      "org.apache.poi.hssf.record.HorizontalPageBreakRecord",
      "org.apache.poi.hssf.record.VerticalPageBreakRecord",
      "org.apache.poi.hssf.record.HeaderRecord",
      "org.apache.poi.hssf.record.FooterRecord",
      "org.apache.poi.hssf.record.HCenterRecord",
      "org.apache.poi.hssf.record.VCenterRecord",
      "org.apache.poi.hssf.record.PrintSetupRecord",
      "org.apache.poi.hssf.record.DefaultColWidthRecord",
      "org.apache.poi.hssf.record.aggregates.ColumnInfoRecordsAggregate",
      "org.apache.poi.hssf.record.DimensionsRecord",
      "org.apache.poi.hssf.record.aggregates.RowRecordsAggregate",
      "org.apache.poi.hssf.record.aggregates.SharedValueManager",
      "org.apache.poi.hssf.record.aggregates.ValueRecordsAggregate",
      "org.apache.poi.hssf.record.WindowTwoRecord",
      "org.apache.poi.hssf.record.SelectionRecord",
      "org.apache.poi.hssf.util.CellRangeAddressBase",
      "org.apache.poi.hssf.util.CellRangeAddress8Bit",
      "org.templateit.Template",
      "org.templateit.StaticTemplate",
      "org.templateit.Region",
      "org.apache.poi.ddf.EscherRecord",
      "org.apache.poi.ddf.EscherContainerRecord",
      "org.apache.poi.ddf.EscherDggRecord",
      "org.apache.poi.ddf.EscherOptRecord",
      "org.apache.poi.ddf.EscherSplitMenuColorsRecord",
      "org.apache.poi.hssf.model.DrawingManager2",
      "org.apache.poi.ddf.EscherProperty",
      "org.apache.poi.ddf.EscherSimpleProperty",
      "org.apache.poi.ddf.EscherBoolProperty",
      "org.apache.poi.ddf.EscherRGBProperty",
      "org.apache.poi.hssf.record.AbstractEscherHolderRecord",
      "org.apache.poi.hssf.record.DrawingGroupRecord",
      "org.apache.poi.hssf.record.EscherAggregate",
      "org.apache.poi.hssf.usermodel.HSSFPatriarch",
      "org.templateit.TemplateSheet",
      "org.apache.poi.hssf.record.SCLRecord",
      "org.apache.poi.hssf.record.UnknownRecord",
      "org.apache.poi.hssf.util.CellReference",
      "org.templateit.Parameter",
      "org.templateit.Reference",
      "org.apache.poi.hssf.usermodel.HSSFPalette",
      "org.apache.poi.hssf.record.PaletteRecord",
      "org.apache.poi.hssf.record.PColor",
      "org.apache.poi.hssf.record.FileSharingRecord",
      "org.apache.poi.hssf.record.WriteProtectRecord",
      "org.apache.poi.hssf.usermodel.HSSFDataFormat",
      "org.apache.poi.ddf.EscherBlipRecord",
      "org.apache.poi.ddf.EscherBitmapBlip",
      "org.apache.poi.ddf.EscherBSERecord",
      "org.apache.poi.hssf.record.RecordInputStream",
      "org.apache.poi.hssf.record.RecordFormatException",
      "org.apache.poi.hssf.record.SSTRecordSizeCalculator",
      "org.apache.poi.hssf.record.UnicodeString$UnicodeRecordStats",
      "org.apache.poi.hssf.record.SSTSerializer",
      "org.apache.poi.hssf.record.SSTRecordHeader",
      "org.apache.poi.poifs.filesystem.POIFSFileSystem$CloseIgnoringInputStream",
      "org.apache.poi.hssf.usermodel.HSSFCellStyle",
      "org.apache.poi.hssf.record.NameRecord",
      "org.apache.poi.hssf.record.formula.Ptg",
      "org.apache.poi.hssf.usermodel.HSSFName",
      "org.apache.poi.hssf.usermodel.HSSFPrintSetup",
      "org.apache.poi.hssf.usermodel.HSSFSheetConditionalFormatting",
      "org.apache.poi.hssf.record.aggregates.ConditionalFormattingTable",
      "org.apache.poi.hssf.model.RecordOrderer",
      "org.apache.poi.hssf.record.aggregates.DataValidityTable",
      "org.apache.poi.util.LittleEndian$BufferUnderrunException",
      "org.apache.poi.hssf.record.formula.OperandPtg",
      "org.apache.poi.hssf.record.formula.AreaPtgBase",
      "org.apache.poi.hssf.record.formula.Area3DPtg",
      "org.apache.poi.hssf.util.AreaReference",
      "org.apache.poi.hssf.util.RangeAddress",
      "org.apache.poi.hssf.record.formula.RefPtgBase",
      "org.apache.poi.hssf.record.formula.Ref3DPtg",
      "org.apache.poi.hssf.usermodel.HeaderFooter$Field",
      "org.apache.poi.hssf.usermodel.HeaderFooter$PairField",
      "org.apache.poi.hssf.usermodel.HeaderFooter",
      "org.apache.poi.hssf.usermodel.HSSFHeader",
      "org.apache.poi.poifs.storage.DocumentBlock",
      "org.apache.poi.poifs.property.DirectoryProperty$PropertyComparator",
      "org.apache.poi.hssf.usermodel.HSSFWorkbook$SheetRecordCollector",
      "org.apache.poi.hssf.record.aggregates.RecordAggregate$PositionTrackingVisitor",
      "org.apache.poi.hssf.record.aggregates.RecordAggregate$RecordSizingVisitor",
      "org.apache.poi.hssf.record.IndexRecord",
      "org.apache.poi.hssf.util.Region",
      "org.apache.poi.hssf.model.Sheet$RecordCloner",
      "org.apache.poi.hssf.model.RecordStream",
      "org.apache.poi.hssf.record.ColumnInfoRecord",
      "org.apache.poi.hssf.record.formula.FormulaShifter",
      "org.apache.poi.hssf.record.RowRecord",
      "org.apache.poi.hssf.record.PaneRecord"
    );
  }
}
