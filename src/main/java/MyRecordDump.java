package asm.models;
import java.util.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*;
public class MyRecordDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_6, ACC_PUBLIC + ACC_SUPER, "models/MyRecord", null, "java/lang/Object", new String[] { "models/DynamicBase", "scala/Product", "scala/Serializable" });

{
av0 = cw.visitAnnotation("Lscala/reflect/ScalaSignature;", true);
av0.visit("bytes", "\u0006\u0001\u0005Ua\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001aE\u0003\u0001\r1\u00012\u0003\u0005\u0002\u0008\u00155\u0009\u0001BC\u0001\n\u0003\u0015\u00198-\u00197b\u0013\u0009Y\u0001B\u0001\u0004B]f\u0014VM\u001a\u0009\u0003\u001b9i\u0011AA\u0005\u0003\u001f\u0009\u00111\u0002R=oC6L7MQ1tKB\u0011q!E\u0005\u0003%!\u0011q\u0001\u0015:pIV\u001cG\u000f\u0005\u0002\u0008)%\u0011Q\u0003\u0003\u0002\r'\u0016\u0014\u0018.\u00197ju\u0006\u0014G.\u001a\u0005\u0009/\u0001\u0011)\u001a!C\u00011\u0005\u0009\u00010F\u0001\u001a!\u0009QRD\u0004\u0002\u00087%\u0011A\u0004C\u0001\u0007!J,G-\u001a4\n\u0005yy\"AB*ue&twM\u0003\u0002\u001d\u0011!A\u0011\u0005\u0001B\u0009B\u0003%\u0011$\u0001\u0002yA!)1\u0005\u0001C\u0001I\u00051A(\u001b8jiz\"\"!\n\u0014\u0011\u00055\u0001\u0001\"B\u000c#\u0001\u0004I\u0002b\u0002\u0015\u0001\u0003\u0003%\u0009!K\u0001\u0005G>\u0004\u0018\u0010\u0006\u0002&U!9qc\nI\u0001\u0002\u0004I\u0002b\u0002\u0017\u0001#\u0003%\u0009!L\u0001\u000fG>\u0004\u0018\u0010\n3fM\u0006,H\u000e\u001e\u00132+\u0005q#FA\r0W\u0005\u0001\u0004CA\u00197\u001b\u0005\u0011$BA\u001a5\u0003%)hn\u00195fG.,GM\u0003\u00026\u0011\u0005Q\u0011M\u001c8pi\u0006$\u0018n\u001c8\n\u0005]\u0012$!E;oG\",7m[3e-\u0006\u0014\u0018.\u00198dK\"9\u0011\u0008AA\u0001\n\u0003R\u0014!\u00049s_\u0012,8\r\u001e)sK\u001aL\u00070F\u0001<!\u0009a\u0014)D\u0001>\u0015\u0009qt(\u0001\u0003mC:<'\"\u0001!\u0002\u0009)\u000cg/Y\u0005\u0003=uBqa\u0011\u0001\u0002\u0002\u0013\u0005A)\u0001\u0007qe>$Wo\u0019;Be&$\u00180F\u0001F!\u00099a)\u0003\u0002H\u0011\u0009\u0019\u0011J\u001c;\u0009\u000f%\u0003\u0011\u0011!C\u0001\u0015\u0006q\u0001O]8ek\u000e$X\u0009\\3nK:$HCA&O!\u00099A*\u0003\u0002N\u0011\u0009\u0019\u0011I\\=\u0009\u000f=C\u0015\u0011!a\u0001\u000b\u0006\u0019\u0001\u0010J\u0019\u0009\u000fE\u0003\u0011\u0011!C!%\u0006y\u0001O]8ek\u000e$\u0018\n^3sCR|'/F\u0001T!\r!vkS\u0007\u0002+*\u0011a\u000bC\u0001\u000bG>dG.Z2uS>t\u0017B\u0001-V\u0005!IE/\u001a:bi>\u0014\u0008b\u0002.\u0001\u0003\u0003%\u0009aW\u0001\u0009G\u0006tW)];bYR\u0011Al\u0018\u0009\u0003\u000fuK!A\u0018\u0005\u0003\u000f\u0009{w\u000e\\3b]\"9q*WA\u0001\u0002\u0004Y\u0005bB1\u0001\u0003\u0003%\u0009EY\u0001\u0009Q\u0006\u001c\u0008nQ8eKR\u0009Q\u0009C\u0004e\u0001\u0005\u0005I\u0011I3\u0002\u0011Q|7\u000b\u001e:j]\u001e$\u0012a\u000f\u0005\u0008O\u0002\u0009\u0009\u0011\"\u0011i\u0003\u0019)\u0017/^1mgR\u0011A,\u001b\u0005\u0008\u001f\u001a\u000c\u0009\u00111\u0001L\u000f\u001dY'!!A\u0009\u00021\u000c\u0001\"T=SK\u000e|'\u000f\u001a\u0009\u0003\u001b54q!\u0001\u0002\u0002\u0002#\u0005anE\u0002n_N\u0001B\u0001]:\u001aK5\u0009\u0011O\u0003\u0002s\u0011\u00059!/\u001e8uS6,\u0017B\u0001;r\u0005E\u0009%m\u001d;sC\u000e$h)\u001e8di&|g.\r\u0005\u0006G5$\u0009A\u001e\u000b\u0002Y\"9A-\\A\u0001\n\u000b*\u0007bB=n\u0003\u0003%\u0009I_\u0001\u0006CB\u0004H.\u001f\u000b\u0003KmDQa\u0006=A\u0002eAq!`7\u0002\u0002\u0013\u0005e0A\u0004v]\u0006\u0004\u0008\u000f\\=\u0015\u0007}\u000c)\u0001\u0005\u0003\u0008\u0003\u0003I\u0012bAA\u0002\u0011\u00091q\n\u001d;j_:Da!a\u0002}\u0001\u0004)\u0013a\u0001=%a!I\u00111B7\u0002\u0002\u0013%\u0011QB\u0001\u000ce\u0016\u000cGMU3t_24X\r\u0006\u0002\u0002\u0010A\u0019A(!\u0005\n\u0007\u0005MQH\u0001\u0004PE*,7\r\u001e");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/String;", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "andThen", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<Lmodels/MyRecord;TA;>;)Lscala/Function1<Ljava/lang/String;TA;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "andThen", "(Lscala/Function1;)Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "compose", "(Lscala/Function1;)Lscala/Function1;", "<A:Ljava/lang/Object;>(Lscala/Function1<TA;Ljava/lang/String;>;)Lscala/Function1<TA;Lmodels/MyRecord;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "models/MyRecord$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord$", "compose", "(Lscala/Function1;)Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "x", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "models/MyRecord", "x", "Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Ljava/lang/String;)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "models/MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitMethodInsn(INVOKESPECIAL, "models/MyRecord", "<init>", "(Ljava/lang/String;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
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
Label l0 = new Label();
Label l1 = new Label();
mv.visitTableSwitchInsn(0, 0, l1, new Label[] { l0 });
mv.visitLabel(l1);
mv.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
mv.visitTypeInsn(NEW, "java/lang/IndexOutOfBoundsException");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;");
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/IndexOutOfBoundsException", "<init>", "(Ljava/lang/String;)V");
mv.visitInsn(ATHROW);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 3);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productIterator", "()Lscala/collection/Iterator;", "()Lscala/collection/Iterator<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "scala/runtime/ScalaRunTime$", "MODULE$", "Lscala/runtime/ScalaRunTime$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "scala/runtime/ScalaRunTime$", "typedProductIterator", "(Lscala/Product;)Lscala/collection/Iterator;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
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
mv.visitInsn(ICONST_1);
mv.visitVarInsn(ISTORE, 3);
Label l2 = new Label();
mv.visitJumpInsn(GOTO, l2);
mv.visitLabel(l1);
mv.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
mv.visitInsn(ICONST_0);
mv.visitVarInsn(ISTORE, 3);
mv.visitLabel(l2);
mv.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
mv.visitVarInsn(ILOAD, 3);
Label l3 = new Label();
mv.visitJumpInsn(IFEQ, l3);
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(CHECKCAST, "models/MyRecord");
mv.visitVarInsn(ASTORE, 4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Ljava/lang/String;");
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "x", "()Ljava/lang/String;");
mv.visitVarInsn(ASTORE, 5);
mv.visitInsn(DUP);
Label l4 = new Label();
mv.visitJumpInsn(IFNONNULL, l4);
mv.visitInsn(POP);
mv.visitVarInsn(ALOAD, 5);
Label l5 = new Label();
mv.visitJumpInsn(IFNULL, l5);
Label l6 = new Label();
mv.visitJumpInsn(GOTO, l6);
mv.visitLabel(l4);
mv.visitFrame(Opcodes.F_FULL, 6, new Object[] {"models/MyRecord", "java/lang/Object", "java/lang/Object", Opcodes.INTEGER, "models/MyRecord", "java/lang/String"}, 1, new Object[] {"java/lang/String"});
mv.visitVarInsn(ALOAD, 5);
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l6);
mv.visitLabel(l5);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitVarInsn(ALOAD, 4);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "models/MyRecord", "canEqual", "(Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l6);
mv.visitInsn(ICONST_1);
Label l7 = new Label();
mv.visitJumpInsn(GOTO, l7);
mv.visitLabel(l6);
mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
mv.visitInsn(ICONST_0);
mv.visitLabel(l7);
mv.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
mv.visitJumpInsn(IFEQ, l3);
mv.visitLabel(l0);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", "java/lang/Object"}, 0, new Object[] {});
mv.visitInsn(ICONST_1);
Label l8 = new Label();
mv.visitJumpInsn(GOTO, l8);
mv.visitLabel(l3);
mv.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", Opcodes.INTEGER}, 0, null);
mv.visitInsn(ICONST_0);
mv.visitLabel(l8);
mv.visitFrame(Opcodes.F_FULL, 2, new Object[] {"models/MyRecord", "java/lang/Object"}, 1, new Object[] {Opcodes.INTEGER});
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 6);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitFieldInsn(PUTFIELD, "models/MyRecord", "x", "Ljava/lang/String;");
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
