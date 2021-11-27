;;
(ns stm4clj.backsideapi)

;; map-like interface for various backside implementations

(defprotocol IBackside
  (put-proxy [this proxy])
  (get-proxy [this locator])
  (delete-proxy [this locator])
  (find-proxy [this query])
  (list-proxies [this offset count])

  )


