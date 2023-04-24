package qn;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class i implements l {

    /* renamed from: d */
    public static /* synthetic */ Class f25103d;

    /* renamed from: a */
    public Class f25104a;

    /* renamed from: b */
    public String f25105b;

    /* renamed from: c */
    public Object f25106c;

    public i(String str) {
        this.f25105b = str;
    }

    @Override // qn.l
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer("local://");
        stringBuffer.append(this.f25105b);
        return stringBuffer.toString();
    }

    @Override // qn.l
    public final OutputStream b() {
        try {
            return (OutputStream) this.f25104a.getMethod("getClientOutputStream", new Class[0]).invoke(this.f25106c, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // qn.l
    public final InputStream getInputStream() {
        try {
            return (InputStream) this.f25104a.getMethod("getClientInputStream", new Class[0]).invoke(this.f25106c, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:40:0x0023
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // qn.l
    public final void start() {
        /*
            r7 = this;
            java.lang.String r0 = "com.ibm.mqttdirect.modules.local.bindings.localListener"
            r1 = 0
            r2 = 1
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            r3 = 32103(0x7d67, float:4.4986E-41)
            if (r0 == 0) goto L4d
            java.lang.String r0 = "com.ibm.mqttdirect.modules.local.bindings.localListener"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L42
            r7.f25104a = r0     // Catch: java.lang.Exception -> L42
            java.lang.String r4 = "connect"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L42
            java.lang.Class r6 = qn.i.f25103d     // Catch: java.lang.Exception -> L42
            if (r6 != 0) goto L2e
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            qn.i.f25103d = r6     // Catch: java.lang.Exception -> L42
            goto L2e
        L23:
            r0 = move-exception
            java.lang.NoClassDefFoundError r1 = new java.lang.NoClassDefFoundError     // Catch: java.lang.Exception -> L42
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Exception -> L42
            r1.<init>(r0)     // Catch: java.lang.Exception -> L42
            throw r1     // Catch: java.lang.Exception -> L42
        L2e:
            r5[r1] = r6     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Method r0 = r0.getMethod(r4, r5)     // Catch: java.lang.Exception -> L42
            r4 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L42
            java.lang.String r5 = r7.f25105b     // Catch: java.lang.Exception -> L42
            r2[r1] = r5     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r0.invoke(r4, r2)     // Catch: java.lang.Exception -> L42
            r7.f25106c = r0     // Catch: java.lang.Exception -> L42
            goto L43
        L42:
        L43:
            java.lang.Object r0 = r7.f25106c
            if (r0 == 0) goto L48
            return
        L48:
            pn.n r0 = bi.m0.h(r3)
            throw r0
        L4d:
            pn.n r0 = bi.m0.h(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.i.start():void");
    }

    @Override // qn.l
    public final void stop() {
        if (this.f25106c != null) {
            try {
                this.f25104a.getMethod("close", new Class[0]).invoke(this.f25106c, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }
}
