package n6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m extends z {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: d */
    public final String f22100d;

    /* renamed from: e */
    public final o5.g f22101e;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "source");
        this.f22100d = "instagram_login";
        this.f22101e = o5.g.f22726g;
    }

    public m(p pVar) {
        super(pVar);
        this.f22100d = "instagram_login";
        this.f22101e = o5.g.f22726g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // n6.w
    public final String f() {
        return this.f22100d;
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    @Override // n6.w
    public final int o(n6.p.d r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "init"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L13
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L13
            goto L14
        L13:
        L14:
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "e2e.toString()"
            gm.l.e(r2, r3)
            d6.e0 r3 = d6.e0.f12668a
            n6.p r3 = r24.e()
            androidx.fragment.app.x r3 = r3.f()
            if (r3 != 0) goto L2d
            android.content.Context r3 = o5.v.a()
        L2d:
            java.lang.String r8 = r0.f22126d
            java.util.Set<java.lang.String> r9 = r0.f22124b
            boolean r11 = r25.a()
            n6.d r4 = r0.f22125c
            if (r4 != 0) goto L3b
            n6.d r4 = n6.d.NONE
        L3b:
            r12 = r4
            java.lang.String r4 = r0.f22127e
            java.lang.String r13 = r1.d(r4)
            java.lang.String r14 = r0.f22130h
            java.lang.String r4 = r0.f22132j
            boolean r5 = r0.f22133k
            boolean r15 = r0.f22135m
            boolean r0 = r0.f22136n
            java.lang.Class<d6.e0> r10 = d6.e0.class
            boolean r6 = i6.a.b(r10)
            r22 = 0
            if (r6 == 0) goto L57
            goto L93
        L57:
            java.lang.String r6 = "applicationId"
            gm.l.f(r8, r6)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "permissions"
            gm.l.f(r9, r6)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "authType"
            gm.l.f(r14, r6)     // Catch: java.lang.Throwable -> L8b
            d6.e0$b r7 = new d6.e0$b     // Catch: java.lang.Throwable -> L8b
            r7.<init>()     // Catch: java.lang.Throwable -> L8b
            d6.e0 r6 = d6.e0.f12668a     // Catch: java.lang.Throwable -> L8b
            r16 = 0
            n6.y r18 = n6.y.INSTAGRAM     // Catch: java.lang.Throwable -> L8b
            java.lang.String r21 = ""
            r23 = r10
            r10 = r2
            r19 = r15
            r15 = r16
            r16 = r4
            r17 = r5
            r20 = r0
            android.content.Intent r0 = r6.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L89
            android.content.Intent r22 = d6.e0.r(r3, r0)     // Catch: java.lang.Throwable -> L89
            goto L93
        L89:
            r0 = move-exception
            goto L8e
        L8b:
            r0 = move-exception
            r23 = r10
        L8e:
            r3 = r23
            i6.a.a(r3, r0)
        L93:
            r0 = r22
            java.lang.String r3 = "e2e"
            r1.a(r2, r3)
            d6.e$c r2 = d6.e.c.Login
            int r2 = r2.a()
            r3 = 0
            if (r0 != 0) goto La4
            goto Lb1
        La4:
            n6.p r4 = r24.e()     // Catch: java.lang.Exception -> Lb1
            androidx.fragment.app.r r4 = r4.f22113c     // Catch: java.lang.Exception -> Lb1
            if (r4 != 0) goto Lad
            goto Lb0
        Lad:
            r4.D(r0, r2)     // Catch: java.lang.Exception -> Lb1
        Lb0:
            r3 = 1
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.m.o(n6.p$d):int");
    }

    @Override // n6.z
    public final o5.g q() {
        return this.f22101e;
    }

    @Override // n6.w, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "dest");
        super.writeToParcel(parcel, i10);
    }
}
