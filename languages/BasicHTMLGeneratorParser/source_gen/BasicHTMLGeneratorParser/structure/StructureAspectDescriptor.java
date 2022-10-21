package BasicHTMLGeneratorParser.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptBotonTag = createDescriptorForBotonTag();
  /*package*/ final ConceptDescriptor myConceptBotonsTag = createDescriptorForBotonsTag();
  /*package*/ final ConceptDescriptor myConceptColor = createDescriptorForColor();
  /*package*/ final ConceptDescriptor myConceptColumna = createDescriptorForColumna();
  /*package*/ final ConceptDescriptor myConceptComponentes = createDescriptorForComponentes();
  /*package*/ final ConceptDescriptor myConceptContenidoOpcion = createDescriptorForContenidoOpcion();
  /*package*/ final ConceptDescriptor myConceptDocument = createDescriptorForDocument();
  /*package*/ final ConceptDescriptor myConceptElement = createDescriptorForElement();
  /*package*/ final ConceptDescriptor myConceptElementBoton = createDescriptorForElementBoton();
  /*package*/ final ConceptDescriptor myConceptElements = createDescriptorForElements();
  /*package*/ final ConceptDescriptor myConceptEtiqueta = createDescriptorForEtiqueta();
  /*package*/ final ConceptDescriptor myConceptEtiquetaTag = createDescriptorForEtiquetaTag();
  /*package*/ final ConceptDescriptor myConceptEtiquetasTag = createDescriptorForEtiquetasTag();
  /*package*/ final ConceptDescriptor myConceptFormulario = createDescriptorForFormulario();
  /*package*/ final ConceptDescriptor myConceptOpcion = createDescriptorForOpcion();
  /*package*/ final ConceptDescriptor myConceptOpcionSelector = createDescriptorForOpcionSelector();
  /*package*/ final ConceptDescriptor myConceptOpcionsSelector = createDescriptorForOpcionsSelector();
  /*package*/ final ConceptDescriptor myConceptSelectorsTag = createDescriptorForSelectorsTag();
  /*package*/ final EnumerationDescriptor myEnumerationColorVersion = new EnumerationDescriptor_ColorVersion();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptBotonTag, myConceptBotonsTag, myConceptColor, myConceptColumna, myConceptComponentes, myConceptContenidoOpcion, myConceptDocument, myConceptElement, myConceptElementBoton, myConceptElements, myConceptEtiqueta, myConceptEtiquetaTag, myConceptEtiquetasTag, myConceptFormulario, myConceptOpcion, myConceptOpcionSelector, myConceptOpcionsSelector, myConceptSelectorsTag);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.BotonTag:
        return myConceptBotonTag;
      case LanguageConceptSwitch.BotonsTag:
        return myConceptBotonsTag;
      case LanguageConceptSwitch.Color:
        return myConceptColor;
      case LanguageConceptSwitch.Columna:
        return myConceptColumna;
      case LanguageConceptSwitch.Componentes:
        return myConceptComponentes;
      case LanguageConceptSwitch.ContenidoOpcion:
        return myConceptContenidoOpcion;
      case LanguageConceptSwitch.Document:
        return myConceptDocument;
      case LanguageConceptSwitch.Element:
        return myConceptElement;
      case LanguageConceptSwitch.ElementBoton:
        return myConceptElementBoton;
      case LanguageConceptSwitch.Elements:
        return myConceptElements;
      case LanguageConceptSwitch.Etiqueta:
        return myConceptEtiqueta;
      case LanguageConceptSwitch.EtiquetaTag:
        return myConceptEtiquetaTag;
      case LanguageConceptSwitch.EtiquetasTag:
        return myConceptEtiquetasTag;
      case LanguageConceptSwitch.Formulario:
        return myConceptFormulario;
      case LanguageConceptSwitch.Opcion:
        return myConceptOpcion;
      case LanguageConceptSwitch.OpcionSelector:
        return myConceptOpcionSelector;
      case LanguageConceptSwitch.OpcionsSelector:
        return myConceptOpcionsSelector;
      case LanguageConceptSwitch.SelectorsTag:
        return myConceptSelectorsTag;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList(myEnumerationColorVersion);
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForBotonTag() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "BotonTag", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f09L);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939785");
    b.version(3);
    b.property("text", 0x2c774475217fa8ffL).type(PrimitiveTypeId.STRING).origin("3204104929761274111").done();
    b.aggregate("color", 0x2c774475217a8f79L).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f0aL).optional(false).ordered(true).multiple(false).origin("3204104929760939897").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBotonsTag() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "BotonsTag", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f07L);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939783");
    b.version(3);
    b.aggregate("elementBoton", 0x2c774475217a8f6cL).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f08L).optional(false).ordered(true).multiple(false).origin("3204104929760939884").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForColor() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "Color", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f0aL);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939786");
    b.version(3);
    b.property("version", 0x2c77447521800cc0L).type(MetaIdFactory.dataTypeId(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c77447521800c96L)).origin("3204104929761299648").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForColumna() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "Columna", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8efcL);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939772");
    b.version(3);
    b.aggregate("element", 0x2c774475217a8f11L).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8efdL).optional(false).ordered(true).multiple(true).origin("3204104929760939793").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForComponentes() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "Componentes", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8efeL);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939774");
    b.version(3);
    b.aggregate("etiquetasTag", 0x2c774475217a8f1fL).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8effL).optional(false).ordered(true).multiple(false).origin("3204104929760939807").done();
    b.aggregate("selectorsTag", 0x2c774475217a8f33L).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f02L).optional(false).ordered(true).multiple(false).origin("3204104929760939827").done();
    b.aggregate("botonsTag", 0x2c774475217a8f36L).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f07L).optional(false).ordered(true).multiple(false).origin("3204104929760939830").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForContenidoOpcion() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "ContenidoOpcion", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f06L);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939782");
    b.version(3);
    b.property("text", 0x2c774475217a8f6aL).type(PrimitiveTypeId.STRING).origin("3204104929760939882").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDocument() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "Document", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x4e1fcda545f5ef3bL);
    b.class_(false, false, true);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/5629444168963452731");
    b.version(3);
    b.property("text", 0x2c774475217a8f96L).type(PrimitiveTypeId.STRING).origin("3204104929760939926").done();
    b.aggregate("elements", 0x4e1fcda545f5ef3dL).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x4e1fcda545f5ef3cL).optional(false).ordered(true).multiple(false).origin("5629444168963452733").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForElement() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "Element", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8efdL);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939773");
    b.version(3);
    b.property("text", 0x2c774475217c1c60L).type(PrimitiveTypeId.STRING).origin("3204104929761041504").done();
    b.aggregate("formulario", 0x2c774475217a8f1cL).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f1eL).optional(false).ordered(true).multiple(false).origin("3204104929760939804").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForElementBoton() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "ElementBoton", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f08L);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939784");
    b.version(3);
    b.aggregate("botonTag", 0x2c774475217a8f6eL).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f09L).optional(false).ordered(true).multiple(true).origin("3204104929760939886").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForElements() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "Elements", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x4e1fcda545f5ef3cL);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/5629444168963452732");
    b.version(3);
    b.property("text", 0x2c774475217be3f8L).type(PrimitiveTypeId.STRING).origin("3204104929761027064").done();
    b.aggregate("columna", 0x2c774475217a8f0bL).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8efcL).optional(false).ordered(true).multiple(false).origin("3204104929760939787").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForEtiqueta() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "Etiqueta", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f00L);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939776");
    b.version(3);
    b.aggregate("etiquetaTag", 0x2c774475217a8f48L).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f01L).optional(false).ordered(true).multiple(true).origin("3204104929760939848").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForEtiquetaTag() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "EtiquetaTag", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f01L);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939777");
    b.version(3);
    b.property("text", 0x2c774475217a8f53L).type(PrimitiveTypeId.STRING).origin("3204104929760939859").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForEtiquetasTag() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "EtiquetasTag", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8effL);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939775");
    b.version(3);
    b.property("text", 0x2c774475217d0772L).type(PrimitiveTypeId.STRING).origin("3204104929761101682").done();
    b.aggregate("etiqueta", 0x2c774475217a8f42L).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f00L).optional(false).ordered(true).multiple(false).origin("3204104929760939842").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFormulario() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "Formulario", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f1eL);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939806");
    b.version(3);
    b.property("text", 0x2c774475217c7d13L).type(PrimitiveTypeId.STRING).origin("3204104929761066259").done();
    b.aggregate("componentes", 0x2c774475217c7d11L).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8efeL).optional(false).ordered(true).multiple(false).origin("3204104929761066257").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOpcion() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "Opcion", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f04L);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939780");
    b.version(3);
    b.aggregate("opcionSelector", 0x2c774475217a8f5bL).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f05L).optional(false).ordered(true).multiple(true).origin("3204104929760939867").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOpcionSelector() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "OpcionSelector", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f05L);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939781");
    b.version(3);
    b.aggregate("contenidoOpcion", 0x2c774475217a8f64L).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f06L).optional(false).ordered(true).multiple(false).origin("3204104929760939876").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOpcionsSelector() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "OpcionsSelector", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f03L);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939779");
    b.version(3);
    b.aggregate("opcion", 0x2c774475217a8f57L).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f04L).optional(false).ordered(true).multiple(false).origin("3204104929760939863").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSelectorsTag() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BasicHTMLGeneratorParser", "SelectorsTag", 0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f02L);
    b.class_(false, false, false);
    b.origin("r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929760939778");
    b.version(3);
    b.aggregate("opcionsSelector", 0x2c774475217a8f55L).target(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f03L).optional(false).ordered(true).multiple(false).origin("3204104929760939861").done();
    return b.create();
  }
}
