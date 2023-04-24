package th;

import android.content.DialogInterface;
import android.widget.EditText;
import com.topstep.fitcloud.pro.ui.dialog.DatePickerDialogFragment;
import com.topstep.fitcloud.pro.ui.dialog.TimePickerDialogFragment;
import th.h;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f28190a;

    /* renamed from: b */
    public final /* synthetic */ Object f28191b;

    /* renamed from: c */
    public final /* synthetic */ Object f28192c;

    public /* synthetic */ g(Object obj, Object obj2, int i10) {
        this.f28190a = i10;
        this.f28191b = obj;
        this.f28192c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        DatePickerDialogFragment.b bVar;
        TimePickerDialogFragment.b bVar2 = null;
        h.a aVar = null;
        switch (this.f28190a) {
            case 0:
                h hVar = (h) this.f28191b;
                EditText editText = (EditText) this.f28192c;
                int i11 = h.B0;
                gm.l.f(hVar, "this$0");
                gm.l.f(editText, "$editText");
                androidx.fragment.app.r rVar = hVar.f2537v;
                if (rVar instanceof h.a) {
                    aVar = (h.a) rVar;
                }
                if (aVar != null) {
                    aVar.p(editText.getText().toString());
                    return;
                }
                return;
            case 1:
                DatePickerDialogFragment datePickerDialogFragment = (DatePickerDialogFragment) this.f28191b;
                m7.a aVar2 = (m7.a) this.f28192c;
                int i12 = DatePickerDialogFragment.B0;
                gm.l.f(datePickerDialogFragment, "this$0");
                gm.l.f(aVar2, "$layout");
                androidx.fragment.app.r rVar2 = datePickerDialogFragment.f2537v;
                if (rVar2 instanceof DatePickerDialogFragment.b) {
                    bVar = (DatePickerDialogFragment.b) rVar2;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    bVar.m(datePickerDialogFragment.f2540y, tb.a.r(aVar2.getDate(), null));
                    return;
                }
                return;
            default:
                m7.b bVar3 = (m7.b) this.f28191b;
                TimePickerDialogFragment timePickerDialogFragment = (TimePickerDialogFragment) this.f28192c;
                int i13 = TimePickerDialogFragment.B0;
                gm.l.f(bVar3, "$layout");
                gm.l.f(timePickerDialogFragment, "this$0");
                int[] value = bVar3.getValue();
                androidx.fragment.app.r rVar3 = timePickerDialogFragment.f2537v;
                if (rVar3 instanceof TimePickerDialogFragment.b) {
                    bVar2 = (TimePickerDialogFragment.b) rVar3;
                }
                if (bVar2 != null) {
                    bVar2.H((value[0] * 60) + value[1], timePickerDialogFragment.f2540y);
                    return;
                }
                return;
        }
    }
}
