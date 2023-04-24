package ai;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.ItemGameSpaceSkinBinding;
import com.topstep.fitcloud.pro.model.game.push.GameSpaceSkin;
import java.util.ArrayList;
import n6.a0;

/* loaded from: classes2.dex */
public final class m extends RecyclerView.e<a> {

    /* renamed from: d */
    public final ArrayList<GameSpaceSkin> f574d;

    /* renamed from: e */
    public final long f575e;

    /* renamed from: f */
    public int f576f;

    /* renamed from: g */
    public final tl.i f577g;

    /* renamed from: h */
    public final tl.i f578h;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemGameSpaceSkinBinding f579u;

        public a(ItemGameSpaceSkinBinding itemGameSpaceSkinBinding) {
            super(itemGameSpaceSkinBinding.getRoot());
            this.f579u = itemGameSpaceSkinBinding;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<Paint> {

        /* renamed from: b */
        public static final b f580b = new b();

        public b() {
            super(0);
        }

        @Override // fm.a
        public final Paint m() {
            Paint paint = new Paint();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.0f);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            return paint;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<Paint> {

        /* renamed from: b */
        public static final c f581b = new c();

        public c() {
            super(0);
        }

        @Override // fm.a
        public final Paint m() {
            Paint paint = new Paint();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            return paint;
        }
    }

    public m(ArrayList<GameSpaceSkin> arrayList, long j10) {
        this.f574d = arrayList;
        this.f575e = j10;
        this.f576f = -1;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            GameSpaceSkin gameSpaceSkin = this.f574d.get(i10);
            gm.l.e(gameSpaceSkin, "items[i]");
            if (y(gameSpaceSkin)) {
                this.f576f = i10;
                break;
            }
            i10++;
        }
        this.f577g = new tl.i(c.f581b);
        this.f578h = new tl.i(b.f580b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        return this.f574d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        boolean z10;
        int i11;
        a aVar2 = aVar;
        GameSpaceSkin gameSpaceSkin = this.f574d.get(i10);
        gm.l.e(gameSpaceSkin, "items[position]");
        GameSpaceSkin gameSpaceSkin2 = gameSpaceSkin;
        ImageView imageView = aVar2.f579u.img;
        gm.l.e(imageView, "holder.viewBind.img");
        a.f.g(imageView, gameSpaceSkin2.getImgUrl(), 12);
        boolean y10 = y(gameSpaceSkin2);
        View view = aVar2.f579u.viewSelect;
        gm.l.e(view, "holder.viewBind.viewSelect");
        if (i10 != this.f576f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
        View view2 = aVar2.f2927a;
        if (y10) {
            view2.setLayerType(2, (Paint) this.f578h.getValue());
            p.b.g(aVar2.f2927a, new n(this, aVar2));
        } else {
            view2.setLayerType(2, (Paint) this.f577g.getValue());
            aVar2.f2927a.setOnClickListener(null);
        }
        aVar2.f579u.tvSpaceSize.setEnabled(y10);
        aVar2.f579u.tvSpaceSize.setText(a0.f(gameSpaceSkin2.getSpaceSize() * 1024, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        ItemGameSpaceSkinBinding inflate = ItemGameSpaceSkinBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new a(inflate);
    }

    public final boolean y(GameSpaceSkin gameSpaceSkin) {
        return this.f575e <= 0 || gameSpaceSkin.getSpaceSize() <= 0 || ((long) gameSpaceSkin.getSpaceSize()) * 1024 > this.f575e;
    }
}
