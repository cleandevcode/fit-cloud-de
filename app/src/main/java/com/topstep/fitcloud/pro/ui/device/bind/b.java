package com.topstep.fitcloud.pro.ui.device.bind;

import android.view.View;
import com.topstep.fitcloud.pro.model.device.DeviceShellSpecify;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyFragment;
import fm.l;
import gm.m;
import java.util.List;

/* loaded from: classes2.dex */
public final class b extends m implements l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ DeviceSpecifyFragment.b f10876b;

    /* renamed from: c */
    public final /* synthetic */ DeviceSpecifyFragment.a f10877c;

    /* renamed from: d */
    public final /* synthetic */ List<DeviceShellSpecify> f10878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DeviceSpecifyFragment.b bVar, DeviceSpecifyFragment.a aVar, List<DeviceShellSpecify> list) {
        super(1);
        this.f10876b = bVar;
        this.f10877c = aVar;
        this.f10878d = list;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        DeviceSpecifyFragment.a.InterfaceC0158a interfaceC0158a;
        gm.l.f(view, "it");
        int d10 = this.f10876b.d();
        if (d10 != -1 && (interfaceC0158a = this.f10877c.f10830e) != null) {
            interfaceC0158a.a(this.f10878d.get(d10));
        }
        return tl.l.f28297a;
    }
}
