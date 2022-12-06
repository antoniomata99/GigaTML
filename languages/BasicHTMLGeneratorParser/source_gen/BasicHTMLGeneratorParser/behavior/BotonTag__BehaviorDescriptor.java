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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SProperty;

public final class BotonTag__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f09L, "BasicHTMLGeneratorParser.structure.BotonTag");

  public static final SMethod<String> interpreter_id6UC9bZLNQ3 = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("interpreter").modifiers(8, AccessPrivileges.PUBLIC).concept(CONCEPT).id("6UC9bZLNQ3").build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(interpreter_id6UC9bZLNQ3);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String interpreter_id6UC9bZLNQ3(@NotNull SNode __thisNode__) {
    String color = Color__BehaviorDescriptor.interpreter_id6UC9bZO9R9.invoke(SLinkOperations.getTarget(__thisNode__, LINKS.color$VatV));
    String nombre = SPropertyOperations.getString(__thisNode__, PROPS.nombre$GN17);
    String tipoBoton = SPropertyOperations.getString(__thisNode__, PROPS.tipoBoton$9Ch7);
    return String.format("<button class='button %s' type='%s'>%s</button>\n", color, tipoBoton, nombre);
  }

  /*package*/ BotonTag__BehaviorDescriptor() {
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
        return (T) ((String) interpreter_id6UC9bZLNQ3(node));
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

  private static final class LINKS {
    /*package*/ static final SContainmentLink color$VatV = MetaAdapterFactory.getContainmentLink(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f09L, 0x2c774475217a8f79L, "color");
  }

  private static final class PROPS {
    /*package*/ static final SProperty nombre$GN17 = MetaAdapterFactory.getProperty(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f09L, 0x2c774475217fa8ffL, "nombre");
    /*package*/ static final SProperty tipoBoton$9Ch7 = MetaAdapterFactory.getProperty(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f09L, 0x40ef7d13bc3558ecL, "tipoBoton");
  }
}