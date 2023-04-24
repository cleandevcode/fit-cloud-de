package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b0.c;
import com.github.kilnn.tool.widget.preference.PreferenceTextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentCollectionCodeBinding implements a {
    public final PreferenceTextView itemAlipay;
    public final PreferenceTextView itemBhim;
    public final PreferenceTextView itemGpay;
    public final PreferenceTextView itemPaypal;
    public final PreferenceTextView itemPaytm;
    public final PreferenceTextView itemPhonePe;
    public final PreferenceTextView itemQq;
    public final PreferenceTextView itemWechat;
    public final LoadingView loadingView;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentCollectionCodeBinding(LinearLayout linearLayout, PreferenceTextView preferenceTextView, PreferenceTextView preferenceTextView2, PreferenceTextView preferenceTextView3, PreferenceTextView preferenceTextView4, PreferenceTextView preferenceTextView5, PreferenceTextView preferenceTextView6, PreferenceTextView preferenceTextView7, PreferenceTextView preferenceTextView8, LoadingView loadingView, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.itemAlipay = preferenceTextView;
        this.itemBhim = preferenceTextView2;
        this.itemGpay = preferenceTextView3;
        this.itemPaypal = preferenceTextView4;
        this.itemPaytm = preferenceTextView5;
        this.itemPhonePe = preferenceTextView6;
        this.itemQq = preferenceTextView7;
        this.itemWechat = preferenceTextView8;
        this.loadingView = loadingView;
        this.toolbar = materialToolbar;
    }

    public static FragmentCollectionCodeBinding bind(View view) {
        int i10 = R.id.item_alipay;
        PreferenceTextView preferenceTextView = (PreferenceTextView) c.m(view, R.id.item_alipay);
        if (preferenceTextView != null) {
            i10 = R.id.item_bhim;
            PreferenceTextView preferenceTextView2 = (PreferenceTextView) c.m(view, R.id.item_bhim);
            if (preferenceTextView2 != null) {
                i10 = R.id.item_gpay;
                PreferenceTextView preferenceTextView3 = (PreferenceTextView) c.m(view, R.id.item_gpay);
                if (preferenceTextView3 != null) {
                    i10 = R.id.item_paypal;
                    PreferenceTextView preferenceTextView4 = (PreferenceTextView) c.m(view, R.id.item_paypal);
                    if (preferenceTextView4 != null) {
                        i10 = R.id.item_paytm;
                        PreferenceTextView preferenceTextView5 = (PreferenceTextView) c.m(view, R.id.item_paytm);
                        if (preferenceTextView5 != null) {
                            i10 = R.id.item_phone_pe;
                            PreferenceTextView preferenceTextView6 = (PreferenceTextView) c.m(view, R.id.item_phone_pe);
                            if (preferenceTextView6 != null) {
                                i10 = R.id.item_qq;
                                PreferenceTextView preferenceTextView7 = (PreferenceTextView) c.m(view, R.id.item_qq);
                                if (preferenceTextView7 != null) {
                                    i10 = R.id.item_wechat;
                                    PreferenceTextView preferenceTextView8 = (PreferenceTextView) c.m(view, R.id.item_wechat);
                                    if (preferenceTextView8 != null) {
                                        i10 = R.id.loading_view;
                                        LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                                        if (loadingView != null) {
                                            i10 = R.id.toolbar;
                                            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                            if (materialToolbar != null) {
                                                return new FragmentCollectionCodeBinding((LinearLayout) view, preferenceTextView, preferenceTextView2, preferenceTextView3, preferenceTextView4, preferenceTextView5, preferenceTextView6, preferenceTextView7, preferenceTextView8, loadingView, materialToolbar);
                                            }
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

    public static FragmentCollectionCodeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCollectionCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_collection_code, viewGroup, false);
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
