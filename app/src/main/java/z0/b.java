package z0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f31839a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x00bb, code lost:
        if (r9.hasValue(r12) != false) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0361  */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList b(android.content.res.Resources r39, android.content.res.XmlResourceParser r40, android.util.AttributeSet r41, android.content.res.Resources.Theme r42) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.b.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
