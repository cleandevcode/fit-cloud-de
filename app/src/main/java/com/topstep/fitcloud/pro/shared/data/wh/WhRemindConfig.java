package com.topstep.fitcloud.pro.shared.data.wh;

import a1.b;
import android.support.v4.media.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class WhRemindConfig {

    /* renamed from: a */
    public final boolean f10111a;

    /* renamed from: b */
    public final int f10112b;

    /* renamed from: c */
    public final int f10113c;

    /* renamed from: d */
    public final int f10114d;

    public WhRemindConfig() {
        this(false, 0, 0, 0, 15, null);
    }

    public WhRemindConfig(int i10, int i11, int i12, boolean z10) {
        this.f10111a = z10;
        this.f10112b = i10;
        this.f10113c = i11;
        this.f10114d = i12;
    }

    public /* synthetic */ WhRemindConfig(boolean z10, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 2) != 0 ? 1260 : i10, (i13 & 4) != 0 ? 1 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 1) != 0 ? true : z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WhRemindConfig) {
            WhRemindConfig whRemindConfig = (WhRemindConfig) obj;
            return this.f10111a == whRemindConfig.f10111a && this.f10112b == whRemindConfig.f10112b && this.f10113c == whRemindConfig.f10113c && this.f10114d == whRemindConfig.f10114d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z10 = this.f10111a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((((r02 * 31) + this.f10112b) * 31) + this.f10113c) * 31) + this.f10114d;
    }

    public final String toString() {
        StringBuilder a10 = d.a("WhRemindConfig(remindDevice=");
        a10.append(this.f10111a);
        a10.append(", remindTime=");
        a10.append(this.f10112b);
        a10.append(", remindAdvance=");
        a10.append(this.f10113c);
        a10.append(", remindType=");
        return b.a(a10, this.f10114d, ')');
    }
}
