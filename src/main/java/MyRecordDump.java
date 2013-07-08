package models;
import java.util.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*;
public class MyRecordDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER, "models/MyRecord", null, "java/lang/Object", new String[] { "scala/ScalaObject", "scala/Product", "scala/Serializable" });

{
av0 = cw.visitAnnotation("Lscala/reflect/ScalaSignature;", true);
av0.visit("bytes", "\u0006\u0001\u0005\u0015a\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001aE\u0003\u0001\r9!r\u0003\u0005\u0002\u0008\u00195\u0009\u0001B\u0003\u0002\n\u0015\u0005!A.\u00198h\u0015\u0005Y\u0011\u0001\u00026bm\u0006L!!\u0004\u0005\u0003\r=\u0013'.Z2u!\u0009y!#D\u0001\u0011\u0015\u0005\u0009\u0012!B:dC2\u000c\u0017BA\n\u0011\u0005-\u00196-\u00197b\u001f\nTWm\u0019;\u0011\u0005=)\u0012B\u0001\u000c\u0011\u0005\u001d\u0001&o\u001c3vGR\u0004\"a\u0004\r\n\u0005e\u0001\"\u0001D*fe&\u000cG.\u001b>bE2,\u0007\u0002C\u000e\u0001\u0005+\u0007I\u0011\u0001\u000f\u0002\u0003a,\u0012!\u0008\u0009\u0003=}i\u0011AA\u0005\u0003A\u0009\u00111A]3d\u0011!\u0011\u0003A!E!\u0002\u0013i\u0012A\u0001=!\u0011\u0015!\u0003\u0001\"\u0001&\u0003\u0019a\u0014N\\5u}Q\u0011ae\n\u0009\u0003=\u0001AQaG\u0012A\u0002uAq!\u000b\u0001\u0002\u0002\u0013\u0005!&\u0001\u0003d_BLHC\u0001\u0014,\u0011\u001dY\u0002\u0006%AA\u0002uAq!\u000c\u0001\u0012\u0002\u0013\u0005a&\u0001\u0008d_BLH\u0005Z3gCVdG\u000fJ\u0019\u0016\u0003=R#!\u0008\u0019,\u0003E\u0002\"AM\u001c\u000e\u0003MR!\u0001N\u001b\u0002\u0013Ut7\r[3dW\u0016$'B\u0001\u001c\u0011\u0003)\u0009gN\\8uCRLwN\\\u0005\u0003qM\u0012\u0011#\u001e8dQ\u0016\u001c7.\u001a3WCJL\u0017M\\2f\u0011\u0015Q\u0004\u0001\"\u0011<\u0003!A\u0017m\u001d5D_\u0012,G#\u0001\u001f\u0011\u0005=i\u0014B\u0001 \u0011\u0005\rIe\u000e\u001e\u0005\u0006\u0001\u0002!\u0009%Q\u0001\u0009i>\u001cFO]5oOR\u0009!\u0009\u0005\u0002D\r:\u0011q\u0002R\u0005\u0003\u000bB\u0009a\u0001\u0015:fI\u00164\u0017BA$I\u0005\u0019\u0019FO]5oO*\u0011Q\u0009\u0005\u0005\u0006\u0015\u0002!\u0009eS\u0001\u0007KF,\u0018\r\\:\u0015\u00051{\u0005CA\u0008N\u0013\u0009q\u0005CA\u0004C_>dW-\u00198\u0009\u000fAK\u0015\u0011!a\u0001#\u0006\u0019\u0001\u0010J\u0019\u0011\u0005=\u0011\u0016BA*\u0011\u0005\r\u0009e.\u001f\u0005\u0006+\u0002!\u0009EV\u0001\u000eaJ|G-^2u!J,g-\u001b=\u0016\u0003]\u0003\"a\u0002-\n\u0005\u001dC\u0001\"\u0002.\u0001\u0009\u0003Z\u0016\u0001\u00049s_\u0012,8\r^!sSRLX#\u0001\u001f\u0009\u000bu\u0003A\u0011\u00090\u0002\u001dA\u0014x\u000eZ;di\u0016cW-\\3oiR\u0011\u0011k\u0018\u0005\u0008!r\u000b\u0009\u00111\u0001=\u0011\u0015\u0009\u0007\u0001\"\u0011c\u0003!\u0019\u0017M\\#rk\u0006dGC\u0001'd\u0011\u001d\u0001\u0006-!AA\u0002E;q!\u001a\u0002\u0002\u0002#\u0015a-\u0001\u0005NsJ+7m\u001c:e!\u0009qrMB\u0004\u0002\u0005\u0005\u0005\u0009R\u00015\u0014\u0009\u001dLgb\u0006\u0009\u0005U6lb%D\u0001l\u0015\u0009a\u0007#A\u0004sk:$\u0018.\\3\n\u00059\\'!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8oc!)Ae\u001aC\u0001aR\u0009a\rC\u0003AO\u0012\u0015#\u000fF\u0001X\u0011\u001d!x-!A\u0005\u0002V\u000cQ!\u00199qYf$\"A\n<\u0009\u000bm\u0019\u0008\u0019A\u000f\u0009\u000fa<\u0017\u0011!CAs\u00069QO\\1qa2LHC\u0001>~!\ry10H\u0005\u0003yB\u0011aa\u00149uS>t\u0007\"\u0002@x\u0001\u00041\u0013a\u0001=%a!9\u0011\u0011A4\u0005\u0012\u0005\r\u0011a\u0003:fC\u0012\u0014Vm]8mm\u0016$\u0012A\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Lmodels/rec;", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "andThen", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<Lmodels/MyRecord;TA;>;)Lscala/Function1<Lmodels/rec;TA;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "andThen", "(Lscala/Function1;)Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "compose", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<TA;Lmodels/rec;>;)Lscala/Function1<TA;Lmodels/MyRecord;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "compose", "(Lscala/Function1;)Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE, "productIterator", "()Lscala/collection/Iterator;", "()Lscala/collection/Iterator<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "productIterator", "(Lscala/Product;)Lscala/collection/Iterator;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE + ACC_DEPRECATED, "productElements", "()Lscala/collection/Iterator;", "()Lscala/collection/Iterator<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "productElements", "(Lscala/Product;)Lscala/collection/Iterator;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "x", "()Lmodels/rec;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "Lmodels/rec;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Lmodels/rec;)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Lmodels/rec;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()Lmodels/rec;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Lmodels/rec;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "scala/runtime/ScalaRunTime$", "MODULE$", "Lscala/runtime/ScalaRunTime$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "scala/runtime/ScalaRunTime$", "_hashCode", "(Lscala/Product;)I");
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "scala/runtime/ScalaRunTime$", "MODULE$", "Lscala/runtime/ScalaRunTime$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "scala/runtime/ScalaRunTime$", "_toString", "(Lscala/Product;)Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
Label l0 = new Label();
mv.visitJumpInsn(IF_ACMPEQ, l0);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ASTORE, 2);
mv.visitVarInsn(ALOAD, 2);
mv.visitTypeInsn(INSTANCEOF, "models/MyRecord");
Label l1 = new Label();
mv.visitJumpInsn(IFEQ, l1);
mv.visitVarInsn(ALOAD, 2);
mv.visitTypeInsn(CHECKCAST, "models/MyRecord");
mv.visitVarInsn(ASTORE, 3);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Lmodels/rec;");
mv.visitVarInsn(ASTORE, 4);
mv.visitVarInsn(ALOAD, 4);
mv.visitVarInsn(ASTORE, 5);
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 5);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "gd2$1", "(Lmodels/rec;)Z");
Label l2 = new Label();
mv.visitJumpInsn(IFEQ, l2);
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(CHECKCAST, "models/MyRecord");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEINTERFACE, "scala/Equals", "canEqual", "(Ljava/lang/Object;)Z");
Label l3 = new Label();
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l2);
mv.visitInsn(ICONST_0);
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l1);
mv.visitInsn(ICONST_0);
mv.visitLabel(l3);
Label l4 = new Label();
mv.visitJumpInsn(IFEQ, l4);
mv.visitLabel(l0);
mv.visitInsn(ICONST_1);
Label l5 = new Label();
mv.visitJumpInsn(GOTO, l5);
mv.visitLabel(l4);
mv.visitInsn(ICONST_0);
mv.visitLabel(l5);
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 6);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productPrefix", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitLdcInsn("MyRecord");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productArity", "()I", null, null);
mv.visitCode();
mv.visitInsn(ICONST_1);
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productElement", "(I)Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ISTORE, 2);
mv.visitVarInsn(ILOAD, 2);
mv.visitInsn(ICONST_0);
Label l0 = new Label();
mv.visitJumpInsn(IF_ICMPNE, l0);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Lmodels/rec;");
mv.visitInsn(ARETURN);
mv.visitLabel(l0);
mv.visitTypeInsn(NEW, "java/lang/IndexOutOfBoundsException");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;");
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/IndexOutOfBoundsException", "<init>", "(Ljava/lang/String;)V");
mv.visitInsn(ATHROW);
mv.visitMaxs(3, 3);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "canEqual", "(Ljava/lang/Object;)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(INSTANCEOF, "models/MyRecord");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "gd2$1", "(Lmodels/rec;)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Lmodels/rec;");
mv.visitVarInsn(ASTORE, 2);
mv.visitInsn(DUP);
Label l0 = new Label();
mv.visitJumpInsn(IFNONNULL, l0);
mv.visitInsn(POP);
mv.visitVarInsn(ALOAD, 2);
Label l1 = new Label();
mv.visitJumpInsn(IFNULL, l1);
Label l2 = new Label();
mv.visitJumpInsn(GOTO, l2);
mv.visitLabel(l0);
mv.visitVarInsn(ALOAD, 2);
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l2);
mv.visitLabel(l1);
mv.visitInsn(ICONST_1);
Label l3 = new Label();
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l2);
mv.visitInsn(ICONST_0);
mv.visitLabel(l3);
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 3);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Lmodels/rec;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "x", "Lmodels/rec;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
