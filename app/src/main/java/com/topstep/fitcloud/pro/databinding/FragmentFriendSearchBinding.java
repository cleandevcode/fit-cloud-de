package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentFriendSearchBinding implements a {
    public final EditText editSearch;
    public final TextView emptyView;
    public final TextInputLayout inputIdentityId;
    public final LinearLayout layoutSearchAction;
    public final FrameLayout layoutSearchResult;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvSearchContent;

    private FragmentFriendSearchBinding(LinearLayout linearLayout, EditText editText, TextView textView, TextInputLayout textInputLayout, LinearLayout linearLayout2, FrameLayout frameLayout, RecyclerView recyclerView, MaterialToolbar materialToolbar, TextView textView2) {
        this.rootView = linearLayout;
        this.editSearch = editText;
        this.emptyView = textView;
        this.inputIdentityId = textInputLayout;
        this.layoutSearchAction = linearLayout2;
        this.layoutSearchResult = frameLayout;
        this.recyclerView = recyclerView;
        this.toolbar = materialToolbar;
        this.tvSearchContent = textView2;
    }

    public static FragmentFriendSearchBinding bind(View view) {
        int i10 = R.id.edit_search;
        EditText editText = (EditText) c.m(view, R.id.edit_search);
        if (editText != null) {
            i10 = R.id.empty_view;
            TextView textView = (TextView) c.m(view, R.id.empty_view);
            if (textView != null) {
                i10 = R.id.input_identity_id;
                TextInputLayout textInputLayout = (TextInputLayout) c.m(view, R.id.input_identity_id);
                if (textInputLayout != null) {
                    i10 = R.id.layout_search_action;
                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_search_action);
                    if (linearLayout != null) {
                        i10 = R.id.layout_search_result;
                        FrameLayout frameLayout = (FrameLayout) c.m(view, R.id.layout_search_result);
                        if (frameLayout != null) {
                            i10 = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
                            if (recyclerView != null) {
                                i10 = R.id.toolbar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                if (materialToolbar != null) {
                                    i10 = R.id.tv_search_content;
                                    TextView textView2 = (TextView) c.m(view, R.id.tv_search_content);
                                    if (textView2 != null) {
                                        return new FragmentFriendSearchBinding((LinearLayout) view, editText, textView, textInputLayout, linearLayout, frameLayout, recyclerView, materialToolbar, textView2);
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

    public static FragmentFriendSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFriendSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_search, viewGroup, false);
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
