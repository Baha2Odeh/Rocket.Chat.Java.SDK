package com.rocketchat.core.model;

import com.google.auto.value.AutoValue;
import com.rocketchat.common.data.Timestamp;
import com.rocketchat.common.data.model.BaseRoom;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import javax.annotation.Nullable;

/**
 * Created by sachin on 19/7/17.
 */
@AutoValue
public abstract class Subscription extends BaseRoom {

    @Json(name = "rid") public abstract String roomId();

    @Json(name = "ts") @Nullable public abstract  @Timestamp Long timestamp();

    @Json(name = "ls") @Nullable public abstract @Timestamp Long lastSeen();

    @Nullable public abstract Boolean open();

    @Nullable public abstract Boolean alert();

    @Nullable public abstract Integer unread();

    @Json(name = "_updatedAt") @Nullable public abstract  @Timestamp Long updatedAt();

    @Nullable public abstract String desktopNotifications();

    @Nullable public abstract String mobilePushNotifications();

    @Nullable public abstract String emailNotifications();

    public static JsonAdapter<Subscription> jsonAdapter(Moshi moshi) {
        return new AutoValue_Subscription.MoshiJsonAdapter(moshi);
    }
}