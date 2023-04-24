package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import n6.p;

/* loaded from: classes.dex */
public final class i extends w {

    /* renamed from: e */
    public static ScheduledThreadPoolExecutor f22093e;

    /* renamed from: c */
    public final String f22094c;

    /* renamed from: d */
    public static final b f22092d = new b();
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i10) {
            return new i[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "parcel");
        this.f22094c = "device_auth";
    }

    public i(p pVar) {
        super(pVar);
        this.f22094c = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // n6.w
    public final String f() {
        return this.f22094c;
    }

    @Override // n6.w
    public final int o(p.d dVar) {
        androidx.fragment.app.x f10 = e().f();
        if (f10 != null && !f10.isFinishing()) {
            h hVar = new h();
            hVar.h1(f10.J(), "login_with_facebook");
            hVar.r1(dVar);
            return 1;
        }
        return 1;
    }
}
