package gg;

import android.support.v4.media.d;
import gm.l;
import java.util.Date;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final Date f15327a;

    /* renamed from: b */
    public final Date f15328b;

    /* renamed from: c */
    public final int f15329c;

    /* renamed from: d */
    public final int f15330d;

    /* renamed from: e */
    public final int f15331e;

    /* renamed from: f */
    public final Integer f15332f;

    /* renamed from: g */
    public final boolean f15333g;

    /* renamed from: h */
    public final Integer f15334h;

    public a(Date date, Date date2, int i10, int i11, int i12, Integer num, boolean z10, Integer num2) {
        l.f(date, "cycleBegin");
        l.f(date2, "cycleEnd");
        this.f15327a = date;
        this.f15328b = date2;
        this.f15329c = i10;
        this.f15330d = i11;
        this.f15331e = i12;
        this.f15332f = num;
        this.f15333g = z10;
        this.f15334h = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return l.a(this.f15327a, aVar.f15327a) && l.a(this.f15328b, aVar.f15328b) && this.f15329c == aVar.f15329c && this.f15330d == aVar.f15330d && this.f15331e == aVar.f15331e && l.a(this.f15332f, aVar.f15332f) && this.f15333g == aVar.f15333g && l.a(this.f15334h, aVar.f15334h);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (((((((this.f15328b.hashCode() + (this.f15327a.hashCode() * 31)) * 31) + this.f15329c) * 31) + this.f15330d) * 31) + this.f15331e) * 31;
        Integer num = this.f15332f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z10 = this.f15333g;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        Integer num2 = this.f15334h;
        return i11 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = d.a("MenstruationResult(cycleBegin=");
        a10.append(this.f15327a);
        a10.append(", cycleEnd=");
        a10.append(this.f15328b);
        a10.append(", dayInCycle=");
        a10.append(this.f15329c);
        a10.append(", dateType=");
        a10.append(this.f15330d);
        a10.append(", pregnancyRate=");
        a10.append(this.f15331e);
        a10.append(", operationType=");
        a10.append(this.f15332f);
        a10.append(", hasSetEndDate=");
        a10.append(this.f15333g);
        a10.append(", remindNext=");
        a10.append(this.f15334h);
        a10.append(')');
        return a10.toString();
    }
}
