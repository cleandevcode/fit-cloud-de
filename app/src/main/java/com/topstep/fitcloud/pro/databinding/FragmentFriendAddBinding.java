package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentFriendAddBinding implements a {
    public final Button btnAdd;
    public final EditText editMsg;
    public final ItemFriendListBinding itemInfo;
    public final LayoutFriendAddMarkBinding itemMark;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentFriendAddBinding(LinearLayout linearLayout, Button button, EditText editText, ItemFriendListBinding itemFriendListBinding, LayoutFriendAddMarkBinding layoutFriendAddMarkBinding, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.btnAdd = button;
        this.editMsg = editText;
        this.itemInfo = itemFriendListBinding;
        this.itemMark = layoutFriendAddMarkBinding;
        this.toolbar = materialToolbar;
    }

    public static FragmentFriendAddBinding bind(View view) {
        int i10 = R.id.btn_add;
        Button button = (Button) c.m(view, R.id.btn_add);
        if (button != null) {
            i10 = R.id.edit_msg;
            EditText editText = (EditText) c.m(view, R.id.edit_msg);
            if (editText != null) {
                i10 = R.id.item_info;
                View m10 = c.m(view, R.id.item_info);
                if (m10 != null) {
                    ItemFriendListBinding bind = ItemFriendListBinding.bind(m10);
                    i10 = R.id.item_mark;
                    View m11 = c.m(view, R.id.item_mark);
                    if (m11 != null) {
                        LayoutFriendAddMarkBinding bind2 = LayoutFriendAddMarkBinding.bind(m11);
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            return new FragmentFriendAddBinding((LinearLayout) view, button, editText, bind, bind2, materialToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFriendAddBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFriendAddBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_add, viewGroup, false);
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
