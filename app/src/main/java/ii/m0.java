package ii;

import android.app.Dialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.topstep.fitcloudpro.R;
import ii.m0;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class m0 extends f.q {

    /* loaded from: classes2.dex */
    public interface a {
        String K();

        void y(String str);
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.NicknameDialogFragment$onCreateDialog$1", f = "NicknameDialogFragment.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f16967e;

        /* renamed from: f */
        public final /* synthetic */ androidx.appcompat.app.d f16968f;

        /* renamed from: g */
        public final /* synthetic */ EditText f16969g;

        /* renamed from: h */
        public final /* synthetic */ m0 f16970h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.appcompat.app.d dVar, EditText editText, m0 m0Var, xl.d<? super b> dVar2) {
            super(2, dVar2);
            this.f16968f = dVar;
            this.f16969g = editText;
            this.f16970h = m0Var;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(this.f16968f, this.f16969g, this.f16970h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f16967e;
            if (i10 == 0) {
                mf.a0.k(obj);
                Button j10 = this.f16968f.j(-1);
                final EditText editText = this.f16969g;
                final m0 m0Var = this.f16970h;
                j10.setOnClickListener(new View.OnClickListener() { // from class: ii.n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z10;
                        m0.a aVar2;
                        EditText editText2 = editText;
                        m0 m0Var2 = m0Var;
                        String h10 = qi.h.h(editText2);
                        if (h10.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            androidx.fragment.app.r rVar = m0Var2.f2537v;
                            if (rVar instanceof m0.a) {
                                aVar2 = (m0.a) rVar;
                            } else {
                                aVar2 = null;
                            }
                            if (aVar2 != null) {
                                aVar2.y(h10);
                            }
                            m0Var2.c1(false, false);
                        }
                    }
                });
                this.f16969g.requestFocus();
                this.f16967e = 1;
                if (mf.a0.g(250L, this) == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mf.a0.k(obj);
            }
            Object systemService = this.f16970h.V0().getSystemService("input_method");
            gm.l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(this.f16969g, 0);
            return tl.l.f28297a;
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
            str = aVar.K();
        } else {
            str = null;
        }
        View inflate = LayoutInflater.from(V0()).inflate(R.layout.edit_text_alert_dialog, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.edit);
        gm.l.e(findViewById, "layout.findViewById(R.id.edit)");
        EditText editText = (EditText) findViewById;
        editText.setText(str);
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(64)});
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.user_info_nickname);
        bVar.m(inflate);
        bVar.f(null);
        bVar.h(17039370, null);
        androidx.appcompat.app.d a10 = bVar.a();
        rm.l.g(this).b(new b(a10, editText, this, null));
        return a10;
    }
}
