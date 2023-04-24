package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class LayoutFriendAddMarkBinding implements a {
    public final EditText editMark;
    private final LinearLayout rootView;
    public final TextView tvMark1;
    public final TextView tvMark2;
    public final TextView tvMark3;
    public final TextView tvMark4;
    public final TextView tvMark5;
    public final TextView tvMark6;
    public final TextView tvMark7;
    public final TextView tvMark8;

    private LayoutFriendAddMarkBinding(LinearLayout linearLayout, EditText editText, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = linearLayout;
        this.editMark = editText;
        this.tvMark1 = textView;
        this.tvMark2 = textView2;
        this.tvMark3 = textView3;
        this.tvMark4 = textView4;
        this.tvMark5 = textView5;
        this.tvMark6 = textView6;
        this.tvMark7 = textView7;
        this.tvMark8 = textView8;
    }

    public static LayoutFriendAddMarkBinding bind(View view) {
        int i10 = R.id.edit_mark;
        EditText editText = (EditText) c.m(view, R.id.edit_mark);
        if (editText != null) {
            i10 = R.id.tv_mark1;
            TextView textView = (TextView) c.m(view, R.id.tv_mark1);
            if (textView != null) {
                i10 = R.id.tv_mark2;
                TextView textView2 = (TextView) c.m(view, R.id.tv_mark2);
                if (textView2 != null) {
                    i10 = R.id.tv_mark3;
                    TextView textView3 = (TextView) c.m(view, R.id.tv_mark3);
                    if (textView3 != null) {
                        i10 = R.id.tv_mark4;
                        TextView textView4 = (TextView) c.m(view, R.id.tv_mark4);
                        if (textView4 != null) {
                            i10 = R.id.tv_mark5;
                            TextView textView5 = (TextView) c.m(view, R.id.tv_mark5);
                            if (textView5 != null) {
                                i10 = R.id.tv_mark6;
                                TextView textView6 = (TextView) c.m(view, R.id.tv_mark6);
                                if (textView6 != null) {
                                    i10 = R.id.tv_mark7;
                                    TextView textView7 = (TextView) c.m(view, R.id.tv_mark7);
                                    if (textView7 != null) {
                                        i10 = R.id.tv_mark8;
                                        TextView textView8 = (TextView) c.m(view, R.id.tv_mark8);
                                        if (textView8 != null) {
                                            return new LayoutFriendAddMarkBinding((LinearLayout) view, editText, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutFriendAddMarkBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutFriendAddMarkBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_friend_add_mark, viewGroup, false);
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
