package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentFriendRenameBinding implements a {
    public final Button btnSave;
    public final LayoutFriendAddMarkBinding itemMark;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentFriendRenameBinding(LinearLayout linearLayout, Button button, LayoutFriendAddMarkBinding layoutFriendAddMarkBinding, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.btnSave = button;
        this.itemMark = layoutFriendAddMarkBinding;
        this.toolbar = materialToolbar;
    }

    public static FragmentFriendRenameBinding bind(View view) {
        int i10 = R.id.btn_save;
        Button button = (Button) c.m(view, R.id.btn_save);
        if (button != null) {
            i10 = R.id.item_mark;
            View m10 = c.m(view, R.id.item_mark);
            if (m10 != null) {
                LayoutFriendAddMarkBinding bind = LayoutFriendAddMarkBinding.bind(m10);
                MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                if (materialToolbar != null) {
                    return new FragmentFriendRenameBinding((LinearLayout) view, button, bind, materialToolbar);
                }
                i10 = R.id.toolbar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFriendRenameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFriendRenameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_rename, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
