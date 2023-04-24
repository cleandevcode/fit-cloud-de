package xh;

import com.topstep.fitcloud.pro.model.dial.DialComponent;
import com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentEditFragment;
import com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentView;
import java.util.List;
import xh.f;

/* loaded from: classes2.dex */
public final class a implements f.a {

    /* renamed from: a */
    public final /* synthetic */ DialComponentEditFragment f30546a;

    /* renamed from: b */
    public final /* synthetic */ int f30547b;

    public a(DialComponentEditFragment dialComponentEditFragment, int i10) {
        this.f30546a = dialComponentEditFragment;
        this.f30547b = i10;
    }

    @Override // xh.f.a
    public final void a(int i10) {
        DialComponent remove;
        DialComponentEditFragment dialComponentEditFragment = this.f30546a;
        mm.h<Object>[] hVarArr = DialComponentEditFragment.f10919p0;
        DialComponentView dialComponentView = dialComponentEditFragment.e1().componentView;
        int i11 = this.f30547b;
        List<DialComponent> list = dialComponentView.f10975d;
        if (list != null && (remove = list.remove(i11)) != null) {
            List<DialComponent> list2 = dialComponentView.f10975d;
            if (list2 != null) {
                list2.add(i11, DialComponent.copy$default(remove, 0, 0, 0, 0, i10, 0, null, 111, null));
            }
            dialComponentView.a(i11);
        }
    }
}
