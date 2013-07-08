package models;
import java.util.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*;
public class rec$Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_5, ACC_PUBLIC + ACC_FINAL + ACC_SUPER, "models/rec$", null, "scala/runtime/AbstractFunction1", new String[] { "scala/ScalaObject", "scala/Serializable" });

// ATTRIBUTE Scala
{
fv = cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "MODULE$", "Lmodels/rec$;", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "<clinit>", "()V", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/rec$");
mv.visitMethodInsn(INVOKESPECIAL, "models/rec$", "<init>", "()V");
mv.visitInsn(RETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "toString", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitLdcInsn("rec");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "unapply", "(Lmodels/rec;)Lscala/Option;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 1);
Label l0 = new Label();
mv.visitJumpInsn(IFNONNULL, l0);
mv.visitFieldInsn(GETSTATIC, "scala/None$", "MODULE$", "Lscala/None$;");
Label l1 = new Label();
mv.visitJumpInsn(GOTO, l1);
mv.visitLabel(l0);
mv.visitTypeInsn(NEW, "scala/Some");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/rec", "i", "()I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitMethodInsn(INVOKESPECIAL, "scala/Some", "<init>", "(Ljava/lang/Object;)V");
mv.visitLabel(l1);
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "apply", "(I)Lmodels/rec;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/rec");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitMethodInsn(INVOKESPECIAL, "models/rec", "<init>", "(I)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "readResolve", "()Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/rec$", "MODULE$", "Lmodels/rec$;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE, "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "unboxToInt", "(Ljava/lang/Object;)I");
mv.visitMethodInsn(INVOKEVIRTUAL, "models/rec$", "apply", "(I)Lmodels/rec;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
{
//mv = cw.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "scala/runtime/AbstractFunction1", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(PUTSTATIC, "models/rec$", "MODULE$", "Lmodels/rec$;");
mv.visitInsn(RETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
