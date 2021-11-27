(ns stm4clj.api.proxy-model-api
  (:import (stm4clj.api.proxy_model_api IProxyModel)))

(defprotocol IProxyModel

  ;;;;;;;;;;;;;;;;;;;;
  ;; Basic Proxy creation
  ;;;;;;;;;;;;;;;;;;;;
  ;; An empty proxy has timestamp, creator, and identity
  (create-proxy [this creator] "Create an empty proxy object")
  (create-subclass-proxy [this creator super-class] "Create a subclass of a super-class")
  (create-instance-proxy [ this creator type-class] "Create an instance of a type")

  ;;;;;;;;;;;;;;;;;;;;;
  ;; Basic Relation Proxy creation
  ;; For the most part, a Relation Proxy is an "instance" proxy, where
  ;; it is an instance of a particular relation type.
  ;; The primary difference lies in the fact that there are additional
  ;; properties:
  ;;    The source Actor proxy and its Role type
  ;;    The target Actor proxy and its Role type
  ;; In effect, a Relation proxy is a Subject Proxy which captures the semantics
  ;; of a particular relationship, e.g. causal, marital, employment, etc.
  ;; An example statement to be captured:
  ;;   CO2, playing the role of an agent which blocks thermal radiation, causes Global Warming
  ;;    playing the role of patient - it is the effect of trapped heat.
  ;; Various ontologies exist to support relation types, role types, and actor types
  ;;;;;;;;;;;;;;;;;;;;;

  (create-relation [this creator source-proxy source-role-type relation-type target-proxy target-role-type])

  )
