package com.orhanobut.wasp.utils;

/**
 * @author Emmar Kardeslik
 */
public enum NetworkMode {

    /**
     * Response will be mocked if mock annotation is present for request
     */
    MOCK,

    /**
     * Response will be retrieved from server regardless of mock annotation
     */
    LIVE

}
