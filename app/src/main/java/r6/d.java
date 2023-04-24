package r6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r6.d;
import r6.d.a;
import r6.e;

/* loaded from: classes.dex */
public abstract class d<M extends d<M, B>, B extends a<M, B>> implements Parcelable {

    /* renamed from: a */
    public final Uri f25353a;

    /* renamed from: b */
    public final List<String> f25354b;

    /* renamed from: c */
    public final String f25355c;

    /* renamed from: d */
    public final String f25356d;

    /* renamed from: e */
    public final String f25357e;

    /* renamed from: f */
    public final e f25358f;

    /* loaded from: classes.dex */
    public static abstract class a<M extends d<M, B>, B extends a<M, B>> {

        /* renamed from: a */
        public Uri f25359a;

        /* renamed from: b */
        public List<String> f25360b;

        /* renamed from: c */
        public String f25361c;

        /* renamed from: d */
        public String f25362d;

        /* renamed from: e */
        public String f25363e;

        /* renamed from: f */
        public e f25364f;
    }

    public d(Parcel parcel) {
        gm.l.f(parcel, "parcel");
        this.f25353a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f25354b = arrayList.isEmpty() ? null : Collections.unmodifiableList(arrayList);
        this.f25355c = parcel.readString();
        this.f25356d = parcel.readString();
        this.f25357e = parcel.readString();
        e.a aVar = new e.a();
        e eVar = (e) parcel.readParcelable(e.class.getClassLoader());
        if (eVar != null) {
            aVar.f25366a = eVar.f25365a;
        }
        this.f25358f = aVar.a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "out");
        parcel.writeParcelable(this.f25353a, 0);
        parcel.writeStringList(this.f25354b);
        parcel.writeString(this.f25355c);
        parcel.writeString(this.f25356d);
        parcel.writeString(this.f25357e);
        parcel.writeParcelable(this.f25358f, 0);
    }

    public d(a<M, B> aVar) {
        gm.l.f(aVar, "builder");
        this.f25353a = aVar.f25359a;
        this.f25354b = aVar.f25360b;
        this.f25355c = aVar.f25361c;
        this.f25356d = aVar.f25362d;
        this.f25357e = aVar.f25363e;
        this.f25358f = aVar.f25364f;
    }
}
