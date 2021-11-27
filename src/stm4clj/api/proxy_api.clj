(ns stm4clj.api.proxy_api)

;; basic functions for any proxy
(defprotocol ICoreProxy
  (set-locator [_ locator])
  (get-locator [_])
  (set-label [_ label])
  (get-label [_])
  (update-label [_ changetuple])
  (add-edge [_ edge direction])
  (get-edge [_ id direction])
  (remove-edge [_ id direction])
  (update-edge [_ changestream])
  (list-edges [_ direction]))

