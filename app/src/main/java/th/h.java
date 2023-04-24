package th;

import android.app.Dialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.topstep.fitcloudpro.R;
import java.nio.charset.Charset;
import kotlin.Metadata;
import mf.a0;
import pm.e0;

@Metadata
/* loaded from: classes2.dex */
public final class h extends f.q {
    public static final /* synthetic */ int B0 = 0;

    /* loaded from: classes2.dex */
    public interface a {
        String S();

        void p(String str);
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.alarm.AlarmLabelDialogFragment$onCreateDialog$1", f = "AlarmLabelDialogFragment.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f28193e;

        /* renamed from: f */
        public final /* synthetic */ EditText f28194f;

        /* renamed from: g */
        public final /* synthetic */ h f28195g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EditText editText, h hVar, xl.d<? super b> dVar) {
            super(2, dVar);
            this.f28194f = editText;
            this.f28195g = hVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(this.f28194f, this.f28195g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f28193e;
            if (i10 == 0) {
                a0.k(obj);
                this.f28194f.requestFocus();
                this.f28193e = 1;
                if (a0.g(250L, this) == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                a0.k(obj);
            }
            Object systemService = this.f28195g.V0().getSystemService("input_method");
            gm.l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(this.f28194f, 0);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements InputFilter {
        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            gm.l.f(charSequence, "source");
            gm.l.f(spanned, "dest");
            String obj = spanned.toString();
            Charset charset = om.a.f23623a;
            byte[] bytes = obj.getBytes(charset);
            gm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
            int length = bytes.length;
            byte[] bytes2 = spanned.subSequence(i12, i13).toString().getBytes(charset);
            gm.l.e(bytes2, "this as java.lang.String).getBytes(charset)");
            int length2 = 32 - (length - bytes2.length);
            if (length2 <= 0) {
                return "";
            }
            byte[] bytes3 = charSequence.subSequence(i10, i11).toString().getBytes(charset);
            gm.l.e(bytes3, "this as java.lang.String).getBytes(charset)");
            if (length2 >= bytes3.length) {
                return null;
            }
            char[] cArr = new char[1];
            int i14 = i10;
            while (i14 < i11) {
                cArr[0] = charSequence.charAt(i14);
                byte[] bytes4 = new String(cArr).getBytes(om.a.f23623a);
                gm.l.e(bytes4, "this as java.lang.String).getBytes(charset)");
                length2 -= bytes4.length;
                if (length2 <= 0) {
                    if (length2 == 0) {
                        i14++;
                    } else if (i14 == i10) {
                        return "";
                    }
                    return charSequence.subSequence(i10, i14);
                }
                i14++;
            }
            return null;
        }
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        a aVar;
        String str;
        androidx.fragment.app.r rVar = this.f2537v;
        if (rVar instanceof a) {
            aVar = (a) rVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            str = aVar.S();
        } else {
            str = null;
        }
        View inflate = LayoutInflater.from(V0()).inflate(R.layout.edit_text_alert_dialog, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.edit);
        gm.l.e(findViewById, "layout.findViewById(R.id.edit)");
        EditText editText = (EditText) findViewById;
        editText.setText(str);
        editText.setFilters(new InputFilter[]{new c()});
        rm.l.g(this).b(new b(editText, this, null));
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.ds_alarm_label);
        bVar.m(inflate);
        bVar.f(null);
        bVar.h(17039370, new g(this, editText, 0));
        return bVar.a();
    }
}
