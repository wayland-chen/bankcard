package com.offke.core.common.util;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * <p>校园通ClassLoader</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public class PUrlClassLoader extends URLClassLoader {

    private final static ClassLoader systemLoader = PUrlClassLoader.class.getClassLoader();

    public PUrlClassLoader(URL[] urls) {
        super(urls, systemLoader);
    }

    public PUrlClassLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }

    public Class<?> load(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    public Class<?> load(String name, boolean resolve) throws ClassNotFoundException {
        if (null != super.findLoadedClass(name))
            return reload(name, resolve);

        Class<?> clazz = super.findClass(name);

        if (resolve)
            super.resolveClass(clazz);

        return clazz;
    }

    public Class<?> reload(String name, boolean resolve) throws ClassNotFoundException {
        return new PUrlClassLoader(super.getURLs(), super.getParent()).load(name, resolve);
    }
}
