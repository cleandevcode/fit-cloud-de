package wh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.n;
import com.topstep.fitcloud.pro.databinding.ItemDialSpacePacketBinding;
import com.topstep.fitcloud.pro.model.dial.DialSpacePacket;
import com.topstep.fitcloud.sdk.v2.utils.dial.DialView;
import com.topstep.fitcloud.sdk.v2.utils.dial.a;
import com.topstep.fitcloudpro.R;
import gm.l;
import gm.m;
import java.util.List;
import n6.a0;
import tl.i;

/* loaded from: classes2.dex */
public final class e extends RecyclerView.e<a> {

    /* renamed from: d */
    public final List<DialSpacePacket> f29842d;

    /* renamed from: e */
    public final long f29843e;

    /* renamed from: f */
    public final sj.e f29844f;

    /* renamed from: g */
    public int f29845g;

    /* renamed from: h */
    public final i f29846h;

    /* renamed from: i */
    public final i f29847i;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemDialSpacePacketBinding f29848u;

        public a(ItemDialSpacePacketBinding itemDialSpacePacketBinding) {
            super(itemDialSpacePacketBinding.getRoot());
            this.f29848u = itemDialSpacePacketBinding;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<Paint> {

        /* renamed from: b */
        public static final b f29849b = new b();

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
    public static final class c extends m implements fm.a<Paint> {

        /* renamed from: b */
        public static final c f29850b = new c();

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

    public e(List<DialSpacePacket> list, long j10, sj.e eVar) {
        l.f(list, "items");
        l.f(eVar, "shape");
        this.f29842d = list;
        this.f29843e = j10;
        this.f29844f = eVar;
        this.f29845g = -1;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            } else if (y(this.f29842d.get(i10))) {
                this.f29845g = i10;
                break;
            } else {
                i10++;
            }
        }
        this.f29846h = new i(c.f29850b);
        this.f29847i = new i(b.f29849b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        return this.f29842d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        int i11;
        boolean z10;
        a aVar2 = aVar;
        DialSpacePacket dialSpacePacket = this.f29842d.get(i10);
        Context context = aVar2.f2927a.getContext();
        DialView dialView = aVar2.f29848u.dialView;
        l.e(dialView, "holder.viewBind.dialView");
        dialView.setShape(this.f29844f);
        boolean z11 = true;
        if (dialSpacePacket.getDialType() == 16) {
            String imgUrl = dialSpacePacket.getImgUrl();
            if (imgUrl != null && imgUrl.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                dialView.setBackgroundBitmap(null);
            } else {
                l.e(context, "context");
                String imgUrl2 = dialSpacePacket.getImgUrl();
                l.c(imgUrl2);
                n<Bitmap> C = com.bumptech.glide.b.c(context).b(context).i().C(imgUrl2);
                C.B(new qi.c(dialView), C);
            }
            dialView.a(null, 800);
        } else {
            l.e(context, "context");
            a.f.e(context, dialView, h7.b.a(context, R.drawable.fc_dial_custom_default_bg));
            byte dialType = dialSpacePacket.getDialType();
            if (dialType == 32) {
                i11 = R.drawable.fc_dial_custom_style_white;
            } else if (dialType == 33) {
                i11 = R.drawable.fc_dial_custom_style_black;
            } else if (dialType == 34) {
                i11 = R.drawable.fc_dial_custom_style_yellow;
            } else if (dialType == 35) {
                i11 = R.drawable.fc_dial_custom_style_green;
            } else if (dialType == 36) {
                i11 = R.drawable.fc_dial_custom_style_gray;
            } else {
                i11 = 0;
            }
            if (i11 != 0) {
                a.f.f(context, dialView, h7.b.a(context, i11), 800);
            } else {
                dialView.a(null, 800);
            }
            dialView.setStylePosition(a.EnumC0212a.TOP);
        }
        boolean y10 = y(dialSpacePacket);
        if (i10 != this.f29845g) {
            z11 = false;
        }
        dialView.setChecked(z11);
        if (y10) {
            dialView.setLayerType(2, (Paint) this.f29847i.getValue());
            p.b.g(dialView, new f(this, aVar2));
        } else {
            dialView.setLayerType(2, (Paint) this.f29846h.getValue());
            dialView.setOnClickListener(null);
        }
        aVar2.f29848u.tvSpaceSize.setEnabled(y10);
        aVar2.f29848u.tvSpaceSize.setText(a0.f(dialSpacePacket.getSpaceSize() * 1024, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        l.f(recyclerView, "parent");
        ItemDialSpacePacketBinding inflate = ItemDialSpacePacketBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new a(inflate);
    }

    public final boolean y(DialSpacePacket dialSpacePacket) {
        return this.f29843e <= 0 || dialSpacePacket.getSpaceSize() <= 0 || ((long) dialSpacePacket.getSpaceSize()) * 1024 > this.f29843e;
    }
}
