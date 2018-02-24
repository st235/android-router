package com.github.sasd97.lib_router.commands.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;

/**
 * Created by alexanderdadukin on 24.02.2018.
 */

public final class ForwardIntent extends ActivityCommand {

    private final Intent intent;

    public ForwardIntent(@NonNull Intent intent) {
        this.intent = intent;
    }

    public ForwardIntent forwardIntent(@NonNull Intent intent) {
        return new ForwardIntent(intent);
    }

    @Override
    public void apply(@NonNull Activity activity) {
        activity.setIntent(intent);
    }
}
