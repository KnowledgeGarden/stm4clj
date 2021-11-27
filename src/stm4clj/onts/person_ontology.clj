(ns stm4clj.onts.person-ontology)

;; TODO think about a *location* schema
;;   see https://schema.org/Place
;; drawing from https://schema.org/Person
;; inherits from core-schema.clj
;; address is a simple string with everything
;;   we might add address components such as street, city, state, etc
;; a person can be affiliated with many entities
;; TODO: beef up naming which means:
;;  there's a givenName, nickName, middleName(s) and
;;  other stuff like M.D. PhD, II, Jr, III, etc

(defn person-ont
  []
  [{:db/ident :address
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one}
   {:db/ident :affiliation
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/many}
   {:db/ident :email
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/many}
   {:db/ident :website
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/many}
   {:db/ident :dob  ;; date of birth
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one}
   {:db/ident :pob  ;; place of birth
    :db/valueType :db.type/string  ;; might be type = location?
    :db/cardinality :db.cardinality/one}
   {:db/ident :gender
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one}])
