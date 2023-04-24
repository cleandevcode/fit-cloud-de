package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final ConstraintLayout f2008a;

    /* renamed from: b */
    public int f2009b = -1;

    /* renamed from: c */
    public int f2010c = -1;

    /* renamed from: d */
    public SparseArray<a> f2011d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<d> f2012e = new SparseArray<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f2013a;

        /* renamed from: b */
        public ArrayList<b> f2014b = new ArrayList<>();

        /* renamed from: c */
        public int f2015c;

        /* renamed from: d */
        public d f2016d;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f2015c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.State_android_id) {
                    this.f2013a = obtainStyledAttributes.getResourceId(index, this.f2013a);
                } else if (index == R.styleable.State_constraints) {
                    this.f2015c = obtainStyledAttributes.getResourceId(index, this.f2015c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2015c);
                    context.getResources().getResourceName(this.f2015c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f2016d = dVar;
                        dVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f2015c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final int a(float f10, float f11) {
            for (int i10 = 0; i10 < this.f2014b.size(); i10++) {
                if (this.f2014b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public float f2017a;

        /* renamed from: b */
        public float f2018b;

        /* renamed from: c */
        public float f2019c;

        /* renamed from: d */
        public float f2020d;

        /* renamed from: e */
        public int f2021e;

        /* renamed from: f */
        public d f2022f;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f2017a = Float.NaN;
            this.f2018b = Float.NaN;
            this.f2019c = Float.NaN;
            this.f2020d = Float.NaN;
            this.f2021e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.Variant_constraints) {
                    this.f2021e = obtainStyledAttributes.getResourceId(index, this.f2021e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2021e);
                    context.getResources().getResourceName(this.f2021e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f2022f = dVar;
                        dVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f2021e, (ViewGroup) null));
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f2020d = obtainStyledAttributes.getDimension(index, this.f2020d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f2018b = obtainStyledAttributes.getDimension(index, this.f2018b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f2019c = obtainStyledAttributes.getDimension(index, this.f2019c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f2017a = obtainStyledAttributes.getDimension(index, this.f2017a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            if (Float.isNaN(this.f2017a) || f10 >= this.f2017a) {
                if (Float.isNaN(this.f2018b) || f11 >= this.f2018b) {
                    if (Float.isNaN(this.f2019c) || f10 <= this.f2019c) {
                        return Float.isNaN(this.f2020d) || f11 <= this.f2020d;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public c(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f2008a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c10 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            if (c10 != 2) {
                                if (c10 != 3) {
                                    if (c10 != 4) {
                                        continue;
                                    } else {
                                        a(context, xml);
                                        continue;
                                    }
                                } else {
                                    b bVar = new b(context, xml);
                                    if (aVar != null) {
                                        aVar.f2014b.add(bVar);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                a aVar2 = new a(context, xml);
                                this.f2011d.put(aVar2.f2013a, aVar2);
                                aVar = aVar2;
                                continue;
                            }
                        }
                    } else {
                        xml.getName();
                        continue;
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0225, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
