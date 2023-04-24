package z0;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final Shader f31840a;

    /* renamed from: b */
    public final ColorStateList f31841b;

    /* renamed from: c */
    public int f31842c;

    public c(Shader shader, ColorStateList colorStateList, int i10) {
        this.f31840a = shader;
        this.f31841b = colorStateList;
        this.f31842c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0182, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Type inference failed for: r5v8, types: [float, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [float, int[]] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [float, android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r8v9, types: [float, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static z0.c a(android.content.res.Resources r28, int r29, android.content.res.Resources.Theme r30) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.c.a(android.content.res.Resources, int, android.content.res.Resources$Theme):z0.c");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.f31840a == null && (colorStateList = this.f31841b) != null && colorStateList.isStateful();
    }
}
