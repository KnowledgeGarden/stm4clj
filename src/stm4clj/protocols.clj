(ns stm4clj.protocols)

;; basic functions for any proxy
(defprotocol core-proxy
  (set-locator [locator])
  (get-locator [nil]) ;; all protocols take at least one argument
  (set-label [label])
  (get-label [nil])
  (update-label [changetuple])
  (add-edge [edge, direction])
  (get-edge [id, direction])
  (remove-edge [id, direction])
  (update-edge [changestream])
  (list-edges [direction]))

