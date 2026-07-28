FROM node:22-bookworm

WORKDIR /app

COPY . .


RUN npm install --only=production
ENTRYPOINT ["node","index.js"]
EXPOSE 8000