package models;
import java.util.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*;
public class recDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER, "models/rec", null, "java/lang/Object", new String[] { "scala/ScalaObject", "scala/Product", "scala/Serializable" });

{
av0 = cw.visitAnnotation("Lscala/reflect/ScalaSignature;", true);
av0.visit("bytes", "\u0006\u0001y4A!\u0001\u0002A\u000b\u0009\u0019!/Z2\u000b\u0003\r\u0009a!\\8eK2\u001c8\u0001A\n\u0006\u0001\u0019qAc\u0006\u0009\u0003\u000f1i\u0011\u0001\u0003\u0006\u0003\u0013)\u0009A\u0001\\1oO*\u00091\"\u0001\u0003kCZ\u000c\u0017BA\u0007\u0009\u0005\u0019y%M[3diB\u0011qBE\u0007\u0002!)\u0009\u0011#A\u0003tG\u0006d\u0017-\u0003\u0002\u0014!\u0009Y1kY1mC>\u0013'.Z2u!\u0009yQ#\u0003\u0002\u0017!\u00099\u0001K]8ek\u000e$\u0008CA\u0008\u0019\u0013\u0009I\u0002C\u0001\u0007TKJL\u0017\r\\5{C\ndW\r\u0003\u0005\u001c\u0001\u0009U\r\u0011\"\u0001\u001d\u0003\u0005IW#A\u000f\u0011\u0005=q\u0012BA\u0010\u0011\u0005\rIe\u000e\u001e\u0005\u0009C\u0001\u0011\u0009\u0012)A\u0005;\u0005\u0011\u0011\u000e\u0009\u0005\u0006G\u0001!\u0009\u0001J\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0005\u0015:\u0003C\u0001\u0014\u0001\u001b\u0005\u0011\u0001\"B\u000e#\u0001\u0004i\u0002bB\u0015\u0001\u0003\u0003%\u0009AK\u0001\u0005G>\u0004\u0018\u0010\u0006\u0002&W!91\u0004\u000bI\u0001\u0002\u0004i\u0002bB\u0017\u0001#\u0003%\u0009AL\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u0005y#FA\u000f1W\u0005\u0009\u0004C\u0001\u001a8\u001b\u0005\u0019$B\u0001\u001b6\u0003%)hn\u00195fG.,GM\u0003\u00027!\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005a\u001a$!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\")!\u0008\u0001C!w\u0005A\u0001.Y:i\u0007>$W\rF\u0001\u001e\u0011\u0015i\u0004\u0001\"\u0011?\u0003!!xn\u0015;sS:<G#A \u0011\u0005\u0001\u001beBA\u0008B\u0013\u0009\u0011\u0005#\u0001\u0004Qe\u0016$WMZ\u0005\u0003\u0009\u0016\u0013aa\u0015;sS:<'B\u0001\"\u0011\u0011\u00159\u0005\u0001\"\u0011I\u0003\u0019)\u0017/^1mgR\u0011\u0011\n\u0014\u0009\u0003\u001f)K!a\u0013\u0009\u0003\u000f\u0009{w\u000e\\3b]\"9QJRA\u0001\u0002\u0004q\u0015a\u0001=%cA\u0011qbT\u0005\u0003!B\u00111!\u00118z\u0011\u0015\u0011\u0006\u0001\"\u0011T\u00035\u0001(o\u001c3vGR\u0004&/\u001a4jqV\u0009A\u000b\u0005\u0002\u0008+&\u0011A\u0009\u0003\u0005\u0006/\u0002!\u0009\u0005H\u0001\raJ|G-^2u\u0003JLG/\u001f\u0005\u00063\u0002!\u0009EW\u0001\u000faJ|G-^2u\u000b2,W.\u001a8u)\u0009q5\u000cC\u0004N1\u0006\u0005\u0009\u0019A\u000f\u0009\u000bu\u0003A\u0011\u00090\u0002\u0011\r\u000cg.R9vC2$\"!S0\u0009\u000f5c\u0016\u0011!a\u0001\u001d\u001e9\u0011MAA\u0001\u0012\u000b\u0011\u0017a\u0001:fGB\u0011ae\u0019\u0004\u0008\u0003\u0009\u0009\u0009\u0011#\u0002e'\u0011\u0019WMD\u000c\u0011\u0009\u0019LW$J\u0007\u0002O*\u0011\u0001\u000eE\u0001\u0008eVtG/[7f\u0013\u0009QwMA\u0009BEN$(/Y2u\rVt7\r^5p]FBQaI2\u0005\u00021$\u0012A\u0019\u0005\u0006{\r$)E\u001c\u000b\u0002)\"9\u0001oYA\u0001\n\u0003\u000b\u0018!B1qa2LHCA\u0013s\u0011\u0015Yr\u000e1\u0001\u001e\u0011\u001d!8-!A\u0005\u0002V\u000cq!\u001e8baBd\u0017\u0010\u0006\u0002wsB\u0019qb^\u000f\n\u0005a\u0004\"AB(qi&|g\u000eC\u0003{g\u0002\u0007Q%A\u0002yIABQ\u0001`2\u0005\u0012u\u000c1B]3bIJ+7o\u001c7wKR\u0009a\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "i", "I", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "andThen", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<Lmodels/rec;TA;>;)Lscala/Function1<Ljava/lang/Object;TA;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/rec$", "MODULE$", "Lmodels/rec$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/rec$", "andThen", "(Lscala/Function1;)Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "compose", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<TA;Ljava/lang/Object;>;)Lscala/Function1<TA;Lmodels/rec;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/rec$", "MODULE$", "Lmodels/rec$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/rec$", "compose", "(Lscala/Function1;)Lscala/Function1;");
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
mv = cw.visitMethod(ACC_PUBLIC, "i", "()I", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/rec", "i", "I");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(I)Lmodels/rec;", null, null);
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
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()I", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/rec", "i", "()I");
mv.visitInsn(IRETURN);
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
mv.visitTypeInsn(INSTANCEOF, "models/rec");
Label l1 = new Label();
mv.visitJumpInsn(IFEQ, l1);
mv.visitVarInsn(ALOAD, 2);
mv.visitTypeInsn(CHECKCAST, "models/rec");
mv.visitVarInsn(ASTORE, 3);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/rec", "i", "()I");
mv.visitVarInsn(ISTORE, 4);
mv.visitVarInsn(ILOAD, 4);
mv.visitVarInsn(ISTORE, 5);
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 5);
mv.visitMethodInsn(INVOKESPECIAL, "models/rec", "gd1$1", "(I)Z");
Label l2 = new Label();
mv.visitJumpInsn(IFEQ, l2);
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(CHECKCAST, "models/rec");
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
mv.visitLdcInsn("rec");
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
mv.visitMethodInsn(INVOKEVIRTUAL, "models/rec", "i", "()I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
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
mv.visitTypeInsn(INSTANCEOF, "models/rec");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "gd1$1", "(I)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/rec", "i", "()I");
Label l0 = new Label();
mv.visitJumpInsn(IF_ICMPNE, l0);
mv.visitInsn(ICONST_1);
Label l1 = new Label();
mv.visitJumpInsn(GOTO, l1);
mv.visitLabel(l0);
mv.visitInsn(ICONST_0);
mv.visitLabel(l1);
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(I)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/rec", "i", "I");
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
