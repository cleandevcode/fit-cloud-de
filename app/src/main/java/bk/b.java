package bk;

import android.content.Context;
import android.database.Cursor;
import android.provider.CallLog;
import jj.o0;
import mf.a0;
import p000do.a;

/* loaded from: classes2.dex */
public final class b extends gm.m implements fm.l<Long, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ d f4416b;

    /* renamed from: c */
    public final /* synthetic */ long f4417c;

    /* renamed from: d */
    public final /* synthetic */ String f4418d;

    /* renamed from: e */
    public final /* synthetic */ hj.a f4419e;

    /* renamed from: f */
    public final /* synthetic */ String f4420f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, long j10, String str, hj.a aVar, String str2) {
        super(1);
        this.f4416b = dVar;
        this.f4417c = j10;
        this.f4418d = str;
        this.f4419e = aVar;
        this.f4420f = str2;
    }

    @Override // fm.l
    public final tl.l k(Long l10) {
        Context context = this.f4416b.f4423a;
        long j10 = this.f4417c;
        String str = this.f4418d;
        gm.l.f(context, "context");
        gm.l.f(str, "phoneNumber");
        boolean z10 = true;
        try {
            Cursor query = context.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"date"}, " type=? and new=? and number like ?", new String[]{"3", "1", '%' + str + '%'}, "date desc");
            if (query != null) {
                int columnIndex = query.getColumnIndex("date");
                while (columnIndex != -1 && query.moveToNext()) {
                    if (Math.abs(query.getLong(columnIndex) - j10) < 3000) {
                        a0.d(query, null);
                        break;
                    }
                }
                tl.l lVar = tl.l.f28297a;
                a0.d(query, null);
            }
        } catch (Exception e10) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#TelephonySmsUtil");
            bVar.q(e10);
        }
        z10 = false;
        if (z10) {
            o0 k10 = this.f4419e.k();
            String str2 = this.f4420f;
            if (str2 == null) {
                str2 = this.f4418d;
            }
            new bl.g(k10.b(25, str2, null)).f();
        }
        return tl.l.f28297a;
    }
}
