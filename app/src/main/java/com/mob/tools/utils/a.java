package com.mob.tools.utils;

import com.mob.tools.utils.ExecutorDispatcher;

/* loaded from: classes.dex */
public interface a {
    <T extends ExecutorDispatcher.SafeRunnable> void executeDelayed(T t10, long j10);

    <T extends ExecutorDispatcher.SafeRunnable> void executeDuctile(T t10);

    <T extends ExecutorDispatcher.SafeRunnable> void executeImmediately(T t10);

    <T extends ExecutorDispatcher.SafeRunnable> void executeSerial(T t10);
}
