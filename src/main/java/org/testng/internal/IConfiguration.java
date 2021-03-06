package org.testng.internal;

import org.testng.*;
import org.testng.internal.annotations.IAnnotationFinder;

import java.util.List;

public interface IConfiguration {
  IAnnotationFinder getAnnotationFinder();

  void setAnnotationFinder(IAnnotationFinder finder);

  ITestObjectFactory getObjectFactory();

  void setObjectFactory(ITestObjectFactory m_objectFactory);

  IHookable getHookable();

  void setHookable(IHookable h);

  IConfigurable getConfigurable();

  void setConfigurable(IConfigurable c);

  List<IExecutionListener> getExecutionListeners();

  default void addExecutionListener(IExecutionListener l) {}

  default boolean addExecutionListenerIfAbsent(IExecutionListener l) {
    return false;
  }

  List<IConfigurationListener> getConfigurationListeners();

  void addConfigurationListener(IConfigurationListener cl);

  boolean alwaysRunListeners();

  void setAlwaysRunListeners(boolean alwaysRun);
}
