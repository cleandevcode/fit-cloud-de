package zj;

import a0.m1;
import gm.l;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import p000do.a;
import yj.b;

/* loaded from: classes2.dex */
public final class i extends k<oj.h> {

    /* renamed from: c */
    public final boolean f32495c;

    /* renamed from: d */
    public final boolean f32496d = false;

    /* renamed from: e */
    public final GregorianCalendar f32497e = new GregorianCalendar();

    /* renamed from: f */
    public final SimpleDateFormat f32498f;

    /* renamed from: g */
    public final SimpleDateFormat f32499g;

    /* renamed from: h */
    public final HashMap<String, ArrayList<b.C0600b>> f32500h;

    /* renamed from: i */
    public ArrayList<b.C0600b> f32501i;

    /* renamed from: j */
    public final int f32502j;

    public i(boolean z10) {
        this.f32495c = z10;
        Locale locale = Locale.US;
        this.f32498f = new SimpleDateFormat("yyyy-MM-dd", locale);
        this.f32499g = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        this.f32500h = new HashMap<>();
        this.f32502j = z10 ? 5 : 1;
    }

    @Override // zj.k
    public final int a() {
        return this.f32502j;
    }

    @Override // zj.k
    public final void b(long j10, byte[] bArr) {
        boolean z10;
        boolean z11;
        int i10;
        if (this.f32495c) {
            long d10 = xj.a.d(bArr, 0, this.f32497e);
            if (!this.f32496d && d10 > this.f32505a) {
                return;
            }
            int i11 = bArr[4] & 255;
            if (i11 >= 0 && i11 < 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return;
            }
            ArrayList<b.C0600b> arrayList = this.f32501i;
            if (arrayList != null) {
                if (i11 == 0) {
                    i10 = 3;
                } else {
                    i10 = i11;
                }
                arrayList.add(new b.C0600b(i10, d10));
            }
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#SleepDecoder");
            bVar.h("%s = %d", this.f32499g.format(new Date(d10)), Integer.valueOf(i11));
        } else if (!this.f32496d && j10 > this.f32505a) {
        } else {
            int i12 = bArr[0] & 255;
            if (1 <= i12 && i12 < 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            ArrayList<b.C0600b> arrayList2 = this.f32501i;
            if (arrayList2 != null) {
                arrayList2.add(new b.C0600b(i12, j10));
            }
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("Fc#SleepDecoder");
            bVar2.h("%s = %d", this.f32499g.format(new Date(j10)), Integer.valueOf(i12));
        }
    }

    @Override // zj.k
    public final void c(b.a aVar) {
        this.f32497e.setTimeInMillis(aVar.f31781b);
        if (this.f32497e.get(11) > 12) {
            GregorianCalendar gregorianCalendar = this.f32497e;
            gregorianCalendar.set(5, gregorianCalendar.get(5) + 1);
        }
        String format = this.f32498f.format(this.f32497e.getTime());
        l.e(format, "formatDate.format(calendar.time)");
        ArrayList<b.C0600b> arrayList = this.f32500h.get(format);
        if (arrayList == null) {
            arrayList = new ArrayList<>(300);
            this.f32500h.put(format, arrayList);
        }
        if (this.f32495c) {
            b.C0600b c0600b = new b.C0600b(0, aVar.f31781b);
            arrayList.add(c0600b);
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#SleepDecoder");
            bVar.h("%s = NONE", this.f32499g.format(new Date(c0600b.f31784a)));
        }
        this.f32501i = arrayList;
    }

    @Override // zj.k
    public final ArrayList e() {
        ArrayList arrayList;
        long j10;
        ArrayList arrayList2;
        boolean z10;
        int i10;
        for (String str : this.f32500h.keySet()) {
            ArrayList<b.C0600b> arrayList3 = this.f32500h.get(str);
            l.c(arrayList3);
            ArrayList<b.C0600b> arrayList4 = arrayList3;
            if (this.f32495c) {
                if (arrayList4.size() > 1) {
                    arrayList = new ArrayList();
                    int i11 = 1;
                    oj.i iVar = null;
                    while (i11 < arrayList4.size()) {
                        b.C0600b c0600b = arrayList4.get(i11);
                        int i12 = i11 - 1;
                        b.C0600b c0600b2 = arrayList4.get(i12);
                        long j11 = c0600b.f31784a;
                        int i13 = i11;
                        int i14 = (j11 > c0600b2.f31784a ? 1 : (j11 == c0600b2.f31784a ? 0 : -1));
                        if (i14 < 0) {
                            p000do.a.f13275a.p("parserNewOneSleepData wrong sleep timestamp:%d and remove it", Long.valueOf(j11));
                            arrayList4.remove(i13);
                            i10 = i12;
                        } else {
                            if (i14 == 0) {
                                p000do.a.f13275a.p("parserNewOneSleepData wrong sleep timestamp:%d and skip it", Long.valueOf(j11));
                            } else {
                                if (iVar != null) {
                                    if (iVar.f23586a == c0600b.f31785b) {
                                        iVar.f23588c = j11;
                                    } else {
                                        arrayList.add(iVar);
                                        iVar = null;
                                    }
                                }
                                if (iVar == null) {
                                    iVar = new oj.i(c0600b.f31785b, c0600b2.f31784a, c0600b.f31784a);
                                }
                                if (i13 == arrayList4.size() - 1) {
                                    arrayList.add(iVar);
                                }
                            }
                            i10 = i13;
                        }
                        i11 = i10 + 1;
                    }
                    arrayList2 = arrayList;
                }
                arrayList2 = null;
            } else {
                if (arrayList4.size() > 0) {
                    Collections.sort(arrayList4, new m1(2));
                    while (arrayList4.size() > 0 && arrayList4.get(0).f31785b == 3) {
                        arrayList4.remove(0);
                    }
                    int size = arrayList4.size();
                    while (true) {
                        size--;
                        if (size < 0 || arrayList4.get(size).f31785b != 3) {
                            break;
                        }
                        arrayList4.remove(size);
                    }
                    if (arrayList4.size() > 0) {
                        arrayList = new ArrayList();
                        oj.i iVar2 = null;
                        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                            b.C0600b c0600b3 = arrayList4.get(i15);
                            if (iVar2 != null) {
                                if (iVar2.f23586a == c0600b3.f31785b) {
                                    iVar2.f23588c = c0600b3.f31784a;
                                } else {
                                    arrayList.add(iVar2);
                                    iVar2 = null;
                                }
                            }
                            if (iVar2 == null) {
                                long j12 = c0600b3.f31784a - 300000;
                                if (arrayList.size() > 0) {
                                    oj.i iVar3 = (oj.i) arrayList.get(arrayList.size() - 1);
                                    long j13 = iVar3.f23588c;
                                    if (j12 >= j13) {
                                        if (j12 - j13 > 900000 && iVar3.f23586a != 3) {
                                            if (c0600b3.f31785b != 3) {
                                                arrayList.add(new oj.i(3, j13, j12));
                                            }
                                        } else {
                                            iVar3.f23588c = j12;
                                        }
                                    }
                                    j10 = j13;
                                    iVar2 = new oj.i(c0600b3.f31785b, j10, c0600b3.f31784a);
                                }
                                j10 = j12;
                                iVar2 = new oj.i(c0600b3.f31785b, j10, c0600b3.f31784a);
                            }
                            if (i15 == arrayList4.size() - 1) {
                                arrayList.add(iVar2);
                            }
                        }
                        arrayList2 = arrayList;
                    }
                }
                arrayList2 = null;
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                try {
                    ArrayList<T> arrayList5 = this.f32506b;
                    Date parse = this.f32498f.parse(str);
                    l.c(parse);
                    arrayList5.add(new oj.h(parse.getTime(), arrayList2));
                } catch (Exception e10) {
                    a.b bVar = p000do.a.f13275a;
                    bVar.t("Fc#SleepDecoder");
                    bVar.q(e10);
                }
            }
        }
        return this.f32506b;
    }
}
