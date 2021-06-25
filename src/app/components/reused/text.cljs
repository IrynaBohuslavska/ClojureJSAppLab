(ns app.components.reused.text)

(defn text [props]
  [:div
   [:h2 (:hdr props)]
   [:p (get props :tx)]
   ])
