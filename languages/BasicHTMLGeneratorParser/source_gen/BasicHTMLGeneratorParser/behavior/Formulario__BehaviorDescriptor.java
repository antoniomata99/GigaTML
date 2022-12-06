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
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public final class Formulario__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f1eL, "BasicHTMLGeneratorParser.structure.Formulario");

  public static final SMethod<String> interpreter_id6UC9bZMio1 = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("interpreter").modifiers(8, AccessPrivileges.PUBLIC).concept(CONCEPT).id("6UC9bZMio1").build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(interpreter_id6UC9bZMio1);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String interpreter_id6UC9bZMio1(@NotNull SNode __thisNode__) {
    return Componentes__BehaviorDescriptor.interpreter_id6UC9bZMbuE.invoke(SLinkOperations.getTarget(__thisNode__, LINKS.componentes$xa9Z)) + "\n" + "</form>";
  }

  /*package*/ Formulario__BehaviorDescriptor() {
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
        return (T) ((String) interpreter_id6UC9bZMio1(node));
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
    /*package*/ static final SContainmentLink componentes$xa9Z = MetaAdapterFactory.getContainmentLink(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f1eL, 0x2c774475217c7d11L, "componentes");
  }
}
