package com.topstep.fitcloud.pro.model.data;

import a0.a2;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import cn.sharesdk.framework.InnerShareParams;
import gm.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mf.u;

@Keep
@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class EcgReport implements Parcelable {
    private static final String LANGUAGE_CH = "CH";
    private static final String LANGUAGE_EN = "EN";
    private final String language;
    private final String url;
    public static final b Companion = new b();
    public static final Parcelable.Creator<EcgReport> CREATOR = new a();

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<EcgReport> {
        @Override // android.os.Parcelable.Creator
        public final EcgReport createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new EcgReport(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EcgReport[] newArray(int i10) {
            return new EcgReport[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static EcgReport a(String str, List list) {
            l.f(str, "language");
            if (list != null && (!list.isEmpty())) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    EcgReport ecgReport = (EcgReport) it.next();
                    if (l.a(str, ecgReport.getLanguage())) {
                        return ecgReport;
                    }
                }
            }
            return null;
        }

        public static String b(Context context) {
            l.f(context, "context");
            return h7.a.n(context) ? EcgReport.LANGUAGE_CH : EcgReport.LANGUAGE_EN;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EcgReport(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r2, r0)
            java.lang.String r0 = r2.readString()
            gm.l.c(r0)
            java.lang.String r2 = r2.readString()
            gm.l.c(r2)
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.model.data.EcgReport.<init>(android.os.Parcel):void");
    }

    public EcgReport(String str, String str2) {
        l.f(str, "language");
        l.f(str2, InnerShareParams.URL);
        this.language = str;
        this.url = str2;
    }

    public static /* synthetic */ EcgReport copy$default(EcgReport ecgReport, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ecgReport.language;
        }
        if ((i10 & 2) != 0) {
            str2 = ecgReport.url;
        }
        return ecgReport.copy(str, str2);
    }

    public final String component1() {
        return this.language;
    }

    public final String component2() {
        return this.url;
    }

    public final EcgReport copy(String str, String str2) {
        l.f(str, "language");
        l.f(str2, InnerShareParams.URL);
        return new EcgReport(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcgReport) {
            EcgReport ecgReport = (EcgReport) obj;
            return l.a(this.language, ecgReport.language) && l.a(this.url, ecgReport.url);
        }
        return false;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.language.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a10 = d.a("EcgReport(language=");
        a10.append(this.language);
        a10.append(", url=");
        return a2.a(a10, this.url, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeString(this.language);
        parcel.writeString(this.url);
    }
}
