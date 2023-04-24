package z0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import androidx.core.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        public final C0604d[] f31843a;

        public c(C0604d[] c0604dArr) {
            this.f31843a = c0604dArr;
        }
    }

    /* renamed from: z0.d$d */
    /* loaded from: classes.dex */
    public static final class C0604d {

        /* renamed from: a */
        public final String f31844a;

        /* renamed from: b */
        public final int f31845b;

        /* renamed from: c */
        public final boolean f31846c;

        /* renamed from: d */
        public final String f31847d;

        /* renamed from: e */
        public final int f31848e;

        /* renamed from: f */
        public final int f31849f;

        public C0604d(int i10, String str, String str2, int i11, int i12, boolean z10) {
            this.f31844a = str;
            this.f31845b = i10;
            this.f31846c = z10;
            this.f31847d = str2;
            this.f31848e = i11;
            this.f31849f = i12;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements b {

        /* renamed from: a */
        public final g1.f f31850a;

        /* renamed from: b */
        public final int f31851b;

        /* renamed from: c */
        public final int f31852c;

        /* renamed from: d */
        public final String f31853d;

        public e(g1.f fVar, int i10, int i11, String str) {
            this.f31850a = fVar;
            this.f31852c = i10;
            this.f31851b = i11;
            this.f31853d = str;
        }
    }

    public static b a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        boolean z10;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.FontFamily);
                String string = obtainAttributes.getString(R.styleable.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(R.styleable.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchTimeout, 500);
                String string4 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderSystemFontFamily);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        c(xmlResourceParser);
                    }
                    return new e(new g1.f(string, string2, string3, b(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.FontFamilyFont);
                            int i10 = R.styleable.FontFamilyFont_fontWeight;
                            if (!obtainAttributes2.hasValue(i10)) {
                                i10 = R.styleable.FontFamilyFont_android_fontWeight;
                            }
                            int i11 = obtainAttributes2.getInt(i10, 400);
                            int i12 = R.styleable.FontFamilyFont_fontStyle;
                            if (!obtainAttributes2.hasValue(i12)) {
                                i12 = R.styleable.FontFamilyFont_android_fontStyle;
                            }
                            if (1 == obtainAttributes2.getInt(i12, 0)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int i13 = R.styleable.FontFamilyFont_ttcIndex;
                            if (!obtainAttributes2.hasValue(i13)) {
                                i13 = R.styleable.FontFamilyFont_android_ttcIndex;
                            }
                            int i14 = R.styleable.FontFamilyFont_fontVariationSettings;
                            if (!obtainAttributes2.hasValue(i14)) {
                                i14 = R.styleable.FontFamilyFont_android_fontVariationSettings;
                            }
                            String string5 = obtainAttributes2.getString(i14);
                            int i15 = obtainAttributes2.getInt(i13, 0);
                            int i16 = R.styleable.FontFamilyFont_font;
                            if (!obtainAttributes2.hasValue(i16)) {
                                i16 = R.styleable.FontFamilyFont_android_font;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i16, 0);
                            String string6 = obtainAttributes2.getString(i16);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                c(xmlResourceParser);
                            }
                            arrayList.add(new C0604d(i11, string6, string5, i15, resourceId2, z10));
                        } else {
                            c(xmlResourceParser);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new c((C0604d[]) arrayList.toArray(new C0604d[0]));
            }
            c(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a.a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}
