(ns stm4clj.models.proxy-model
  (:import (stm4clj.api.proxy_model_api IProxyModel)))

(defrecord Proxy_Model
  IProxyModel
  (create-proxy [db creator]
    nil)
  (create-subclass-proxy [db creator super-class]
    nil)
  (create-instance-proxy [ db creator type-class]
    nil)

  (create-relation [db creator source-proxy source-role-type relation-type target-proxy target-role-type]
    nil)
  )
