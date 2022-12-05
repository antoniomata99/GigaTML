package BasicHTMLGeneratorParser.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public final class EtiquetasTag__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8effL, "BasicHTMLGeneratorParser.structure.EtiquetasTag");

  public static final SMethod<String> interpreter_id43JvheWcTdH = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("interpreter").modifiers(8, AccessPrivileges.PUBLIC).concept(CONCEPT).id("43JvheWcTdH").build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(interpreter_id43JvheWcTdH);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String interpreter_id43JvheWcTdH(@NotNull SNode __thisNode__) {
    String nombre = SPropertyOperations.getString(__thisNode__, PROPS.text$GnVy);
    String div = "<div class='field'>\n";
    div = div + String.format("<label class='label'>%s</label>\n", nombre);
    div = div + Etiqueta__BehaviorDescriptor.interpreter_id43JvheWcMrm.invoke(SLinkOperations.getTarget(__thisNode__, LINKS.etiqueta$U$Gq));
    div = div + "</div>";
    return div;
  }

  /*package*/ EtiquetasTag__BehaviorDescriptor() {
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((String) interpreter_id43JvheWcTdH(node));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }

  private static final class PROPS {
    /*package*/ static final SProperty text$GnVy = MetaAdapterFactory.getProperty(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8effL, 0x2c774475217d0772L, "text");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink etiqueta$U$Gq = MetaAdapterFactory.getContainmentLink(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8effL, 0x2c774475217a8f42L, "etiqueta");
  }
}