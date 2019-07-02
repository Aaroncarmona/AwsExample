package com.gmail.carmonespi.aws.aws;

import android.content.Context;

import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;

public class AwsProvider {

    public static AWSConfiguration awsConfiguration(Context context){
        AWSConfiguration awsConfiguration = new AWSConfiguration(context);
        awsConfiguration.setConfiguration("custom");
        return awsConfiguration;
    }

    public static AWSAppSyncClient awsAppSyncClient( Context context) {
        AWSAppSyncClient client = AWSAppSyncClient.builder()
            .context(context)
            .awsConfiguration(awsConfiguration(context))
            .build();
        return client;
    }
}
