package bk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import jj.o0;
import p000do.a;

/* loaded from: classes2.dex */
public abstract class e extends BroadcastReceiver {

    /* renamed from: a */
    public static String f4429a;

    public static void a(hj.b bVar, Context context, String str, String str2) {
        String c10 = m.c(context, str);
        a.b bVar2 = p000do.a.f13275a;
        bVar2.t("Fc#SMS");
        bVar2.h("TYPE_SMS phoneNumber:%s displayName:%s", str, c10);
        o0 k10 = bVar.a().k();
        if (c10 != null) {
            str = c10;
        }
        new bl.g(k10.b(4, str, str2)).f();
    }

    public abstract hj.b b(Context context);

    public abstract boolean c(Context context);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        String action;
        gm.l.f(context, "context");
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#SMS");
        Object[] objArr = new Object[1];
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        objArr[0] = str;
        bVar.h("action:%s", objArr);
        if (intent != null && (action = intent.getAction()) != null) {
            if (gm.l.a(action, "android.provider.Telephony.SMS_RECEIVED") || gm.l.a(action, "android.provider.OppoSpeechAssist.SMS_RECEIVED")) {
                String str2 = f4429a;
                if (str2 == null) {
                    f4429a = action;
                } else if (!gm.l.a(str2, action)) {
                    return;
                }
                if (!c(context)) {
                    return;
                }
                pl.a.f24280b.c(new androidx.emoji2.text.g(this, context, intent, 2));
            }
        }
    }
}
