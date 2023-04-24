package eh;

import a0.a2;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a extends dh.b<C0241a, tl.l> {

    /* renamed from: b */
    public final long f13619b;

    /* renamed from: c */
    public final jg.a f13620c;

    /* renamed from: eh.a$a */
    /* loaded from: classes2.dex */
    public static final class C0241a implements Parcelable {
        public static final C0242a CREATOR = new C0242a();

        /* renamed from: a */
        public final boolean f13621a;

        /* renamed from: b */
        public final String f13622b;

        /* renamed from: c */
        public String f13623c;

        /* renamed from: d */
        public String f13624d;

        /* renamed from: eh.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C0242a implements Parcelable.Creator<C0241a> {
            @Override // android.os.Parcelable.Creator
            public final C0241a createFromParcel(Parcel parcel) {
                boolean z10;
                gm.l.f(parcel, "parcel");
                if (parcel.readByte() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return new C0241a(parcel.readString(), parcel.readString(), parcel.readString(), z10);
            }

            @Override // android.os.Parcelable.Creator
            public final C0241a[] newArray(int i10) {
                return new C0241a[i10];
            }
        }

        public C0241a(String str, String str2, String str3, boolean z10) {
            this.f13621a = z10;
            this.f13622b = str;
            this.f13623c = str2;
            this.f13624d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0241a) {
                C0241a c0241a = (C0241a) obj;
                return this.f13621a == c0241a.f13621a && gm.l.a(this.f13622b, c0241a.f13622b) && gm.l.a(this.f13623c, c0241a.f13623c) && gm.l.a(this.f13624d, c0241a.f13624d);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public final int hashCode() {
            boolean z10 = this.f13621a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            String str = this.f13622b;
            int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f13623c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f13624d;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Params(isPasswordMode=");
            a10.append(this.f13621a);
            a10.append(", password=");
            a10.append(this.f13622b);
            a10.append(", openAppId=");
            a10.append(this.f13623c);
            a10.append(", openAppName=");
            return a2.a(a10, this.f13624d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            gm.l.f(parcel, "parcel");
            parcel.writeByte(this.f13621a ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f13622b);
            parcel.writeString(this.f13623c);
            parcel.writeString(this.f13624d);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.domain.auth.AccountDeleteUseCase", f = "AccountDeleteUseCase.kt", l = {23, 25}, m = "execute")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f13625d;

        /* renamed from: f */
        public int f13627f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f13625d = obj;
            this.f13627f |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    public a(wm.b bVar, long j10, jg.b bVar2) {
        super(bVar);
        this.f13619b = j10;
        this.f13620c = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0037  */
    @Override // dh.b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(eh.a.C0241a r8, xl.d<? super tl.l> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof eh.a.b
            if (r0 == 0) goto L13
            r0 = r9
            eh.a$b r0 = (eh.a.b) r0
            int r1 = r0.f13627f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13627f = r1
            goto L18
        L13:
            eh.a$b r0 = new eh.a$b
            r0.<init>(r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.f13625d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r6.f13627f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            mf.a0.k(r9)
            goto L6c
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            mf.a0.k(r9)
            goto L50
        L37:
            mf.a0.k(r9)
            boolean r9 = r8.f13621a
            if (r9 == 0) goto L53
            jg.a r9 = r7.f13620c
            long r1 = r7.f13619b
            java.lang.String r8 = r8.f13622b
            gm.l.c(r8)
            r6.f13627f = r3
            java.lang.Object r8 = r9.h(r1, r8, r6)
            if (r8 != r0) goto L50
            return r0
        L50:
            tl.l r8 = tl.l.f28297a
            return r8
        L53:
            jg.a r1 = r7.f13620c
            long r3 = r7.f13619b
            java.lang.String r9 = r8.f13623c
            gm.l.c(r9)
            java.lang.String r5 = r8.f13624d
            gm.l.c(r5)
            r6.f13627f = r2
            r2 = r3
            r4 = r9
            java.lang.Object r8 = r1.d(r2, r4, r5, r6)
            if (r8 != r0) goto L6c
            return r0
        L6c:
            tl.l r8 = tl.l.f28297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: eh.a.a(eh.a$a, xl.d):java.lang.Object");
    }
}
