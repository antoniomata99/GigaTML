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
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SProperty;

public final class ContenidoOpcion__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f06L, "BasicHTMLGeneratorParser.structure.ContenidoOpcion");

  public static final SMethod<String> interpreter_id43JvheWdlUn = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("interpreter").modifiers(8, AccessPrivileges.PUBLIC).concept(CONCEPT).id("43JvheWdlUn").build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(interpreter_id43JvheWdlUn);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String interpreter_id43JvheWdlUn(@NotNull SNode __thisNode__) {
    String nombre = SPropertyOperations.getString(__thisNode__, PROPS.nombre$V1ZU);
    String valor = SPropertyOperations.getString(__thisNode__, PROPS.valor$leq1);

    return String.format("<option value='%s'>%s</option>", valor, nombre);
  }

  /*package*/ ContenidoOpcion__BehaviorDescriptor() {
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
        return (T) ((String) interpreter_id43JvheWdlUn(node));
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
    /*package*/ static final SProperty nombre$V1ZU = MetaAdapterFactory.getProperty(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f06L, 0x2c774475217a8f6aL, "nombre");
    /*package*/ static final SProperty valor$leq1 = MetaAdapterFactory.getProperty(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c774475217a8f06L, 0x40ef7d13bc34a055L, "valor");
  }
}