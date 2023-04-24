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
public final class FragmentBusinessCardBinding implements a {
    public final PreferenceTextView itemEmail;
    public final PreferenceTextView itemFacebook;
    public final PreferenceTextView itemInstagram;
    public final PreferenceTextView itemLine;
    public final PreferenceTextView itemLinkedin;
    public final PreferenceTextView itemPhone;
    public final PreferenceTextView itemQq;
    public final PreferenceTextView itemSkype;
    public final PreferenceTextView itemTwitter;
    public final PreferenceTextView itemWechat;
    public final PreferenceTextView itemWhatsapp;
    public final LoadingView loadingView;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentBusinessCardBinding(LinearLayout linearLayout, PreferenceTextView preferenceTextView, PreferenceTextView preferenceTextView2, PreferenceTextView preferenceTextView3, PreferenceTextView preferenceTextView4, PreferenceTextView preferenceTextView5, PreferenceTextView preferenceTextView6, PreferenceTextView preferenceTextView7, PreferenceTextView preferenceTextView8, PreferenceTextView preferenceTextView9, PreferenceTextView preferenceTextView10, PreferenceTextView preferenceTextView11, LoadingView loadingView, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.itemEmail = preferenceTextView;
        this.itemFacebook = preferenceTextView2;
        this.itemInstagram = preferenceTextView3;
        this.itemLine = preferenceTextView4;
        this.itemLinkedin = preferenceTextView5;
        this.itemPhone = preferenceTextView6;
        this.itemQq = preferenceTextView7;
        this.itemSkype = preferenceTextView8;
        this.itemTwitter = preferenceTextView9;
        this.itemWechat = preferenceTextView10;
        this.itemWhatsapp = preferenceTextView11;
        this.loadingView = loadingView;
        this.toolbar = materialToolbar;
    }

    public static FragmentBusinessCardBinding bind(View view) {
        int i10 = R.id.item_email;
        PreferenceTextView preferenceTextView = (PreferenceTextView) c.m(view, R.id.item_email);
        if (preferenceTextView != null) {
            i10 = R.id.item_facebook;
            PreferenceTextView preferenceTextView2 = (PreferenceTextView) c.m(view, R.id.item_facebook);
            if (preferenceTextView2 != null) {
                i10 = R.id.item_instagram;
                PreferenceTextView preferenceTextView3 = (PreferenceTextView) c.m(view, R.id.item_instagram);
                if (preferenceTextView3 != null) {
                    i10 = R.id.item_line;
                    PreferenceTextView preferenceTextView4 = (PreferenceTextView) c.m(view, R.id.item_line);
                    if (preferenceTextView4 != null) {
                        i10 = R.id.item_linkedin;
                        PreferenceTextView preferenceTextView5 = (PreferenceTextView) c.m(view, R.id.item_linkedin);
                        if (preferenceTextView5 != null) {
                            i10 = R.id.item_phone;
                            PreferenceTextView preferenceTextView6 = (PreferenceTextView) c.m(view, R.id.item_phone);
                            if (preferenceTextView6 != null) {
                                i10 = R.id.item_qq;
                                PreferenceTextView preferenceTextView7 = (PreferenceTextView) c.m(view, R.id.item_qq);
                                if (preferenceTextView7 != null) {
                                    i10 = R.id.item_skype;
                                    PreferenceTextView preferenceTextView8 = (PreferenceTextView) c.m(view, R.id.item_skype);
                                    if (preferenceTextView8 != null) {
                                        i10 = R.id.item_twitter;
                                        PreferenceTextView preferenceTextView9 = (PreferenceTextView) c.m(view, R.id.item_twitter);
                                        if (preferenceTextView9 != null) {
                                            i10 = R.id.item_wechat;
                                            PreferenceTextView preferenceTextView10 = (PreferenceTextView) c.m(view, R.id.item_wechat);
                                            if (preferenceTextView10 != null) {
                                                i10 = R.id.item_whatsapp;
                                                PreferenceTextView preferenceTextView11 = (PreferenceTextView) c.m(view, R.id.item_whatsapp);
                                                if (preferenceTextView11 != null) {
                                                    i10 = R.id.loading_view;
                                                    LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                                                    if (loadingView != null) {
                                                        i10 = R.id.toolbar;
                                                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                                        if (materialToolbar != null) {
                                                            return new FragmentBusinessCardBinding((LinearLayout) view, preferenceTextView, preferenceTextView2, preferenceTextView3, preferenceTextView4, preferenceTextView5, preferenceTextView6, preferenceTextView7, preferenceTextView8, preferenceTextView9, preferenceTextView10, preferenceTextView11, loadingView, materialToolbar);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentBusinessCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBusinessCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_business_card, viewGroup, false);
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
