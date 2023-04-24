package ci;

import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.ItemAudioInfoBinding;
import com.topstep.fitcloudpro.R;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<a> {

    /* renamed from: d */
    public List<ci.a> f4717d;

    /* renamed from: e */
    public HashSet<ci.a> f4718e = new HashSet<>();

    /* renamed from: f */
    public long f4719f;

    /* renamed from: g */
    public InterfaceC0075b f4720g;

    /* renamed from: h */
    public boolean f4721h;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemAudioInfoBinding f4722u;

        public a(ItemAudioInfoBinding itemAudioInfoBinding) {
            super(itemAudioInfoBinding.getRoot());
            this.f4722u = itemAudioInfoBinding;
        }
    }

    /* renamed from: ci.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC0075b {
        void a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<ci.a> list = this.f4717d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        ImageView imageView;
        int i11;
        a aVar2 = aVar;
        List<ci.a> list = this.f4717d;
        if (list != null) {
            ci.a aVar3 = list.get(i10);
            aVar2.f4722u.tvName.setText(aVar3.f4707c);
            boolean contains = this.f4718e.contains(aVar3);
            if (contains) {
                imageView = aVar2.f4722u.imgSelect;
                i11 = R.drawable.ic_baseline_check_circle_24;
            } else {
                imageView = aVar2.f4722u.imgSelect;
                i11 = R.drawable.ic_baseline_radio_button_unchecked_24;
            }
            imageView.setImageResource(i11);
            aVar2.f4722u.tvSize.setText(n6.a0.f(aVar3.f4710f, false));
            p.b.g(aVar2.f2927a, new c(contains, this, aVar3, aVar2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        ItemAudioInfoBinding inflate = ItemAudioInfoBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new a(inflate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0032, code lost:
        if (r3 == r7.size()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.util.List<ci.a> r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto Ld
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            if (r2 == 0) goto L12
        L10:
            r0 = 0
            goto L34
        L12:
            java.util.Iterator r2 = r7.iterator()
            r3 = 0
        L17:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r2.next()
            ci.a r4 = (ci.a) r4
            java.util.HashSet<ci.a> r5 = r6.f4718e
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L17
            int r3 = r3 + 1
            goto L17
        L2e:
            int r7 = r7.size()
            if (r3 != r7) goto L10
        L34:
            r6.f4721h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.b.y(java.util.List):void");
    }
}
